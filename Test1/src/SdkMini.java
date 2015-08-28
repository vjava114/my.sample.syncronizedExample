public class SdkMini {

	public static boolean ISSEND = false;
	

	enum Loc {GPS, BLE, NET};
	
	public static void init(){
		
		
		ISSEND = false;
		gps();
		ble();
		network();
		
	}
	
	
	public static  void gps(){
		try {
			System.out.println("gps 처리중...");
			sendServer(Loc.GPS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ble(){
		try {
			System.out.println("ble 처리중...");
			sendServer(Loc.BLE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void network(){
		try {
			System.out.println("network 처리중...");
			sendServer(Loc.NET);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void sendServer(Loc loc) throws InterruptedException{
		
		synchronized (People.class){
			if(!ISSEND){
				new Thread().sleep(1000);	// 알수없는 지연사유 발생..
				ISSEND = true;
				System.out.println("     <<< "+loc+" 정보 전송 성공! >>>");
			}
		}
		
	}
	
}
