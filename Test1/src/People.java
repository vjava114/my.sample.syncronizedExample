/**
 * 
 * @author kang
 *	- 로직 설명 - 
 *	1. 사람 3명이 SdkMini.java 쓰레드를 동시에 수행시킨다
 */
public class People  extends Thread{

	
	public void run(){
		
		SdkMini.init();
		
	}
	
	public static void main(String[] args) {


		// 클릭메소드 발생 1
		People click1 = new People();
		click1.start();
		
		
		// 클릭메소드 발생 2		
		People click2 = new People();
		click2.start();
		
		
		// 클릭메소드 발생 3
		People click3 = new People();
		click3.start();
		
		
		
	}
}
