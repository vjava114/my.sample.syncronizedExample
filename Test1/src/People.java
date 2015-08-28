
public class People  extends Thread{

	
	public void run(){
		
		SdkMini.init();
		
	}
	
	public static void main(String[] args) {
		


		People click1 = new People();
		click1.start();
		
		People click2 = new People();
		click2.start();
		
		People click3 = new People();
		click3.start();
		
		
		
	}
}
