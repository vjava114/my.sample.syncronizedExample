/**
 * 
 * @author kang
 * 
 * 
 * - 로직 설명 - 
 * 1. gps, ble, network 처리결과를 1개씩 수행한다
 * 2. 처리 결과를 서버로 전송한다 // sendServer();
 * 3. 서버 전송까지 성공 했다면 모든 로직을 중단한다.
 *
 */
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
		
		/*
		 *  case 1 : 동기화 처리 되지 않았을 경우, 여러개의 쓰레드가 동시에 아래를 수행 해 버리게 된다.
		 */
//		if(!ISSEND){
//			new Thread().sleep(1000);	// 알수없는 지연사유 발생..   
//			System.out.println("     <<< "+loc+" 정보 전송 성공! >>>");
//			ISSEND = true;
//		}
		
		
		
		/*
		 *  case 2 : 동기화 처리 하여 ISSEND 가 false 인지 검사하는 로직을 차례로 수행 하도록 하여, 한번에 1개씩만 수행하도록 한다.
		 */
		synchronized (People.class){
			if(!ISSEND){
				new Thread().sleep(1000);	// 알수없는 지연사유 발생.. 
				System.out.println("     <<< "+loc+" 정보 전송 성공! >>>");
				ISSEND = true;
			}
		}
		
	}
	
}
