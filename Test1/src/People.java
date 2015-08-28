
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
