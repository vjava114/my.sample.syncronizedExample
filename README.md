# my.sample.syncronizedExample



SdkMini.java
/**
  * @author kang
 *  
 * - 로직 설명 - 
 * 1. gps, ble, network 처리결과를 1개씩 수행한다
 * 2. 처리 결과를 서버로 전송한다 // sendServer();
 * 3. 서버 전송까지 성공 했다면 모든 로직을 중단한다.
 *
 */


People.java
/**
 * 
 * @author kang
 *	- 로직 설명 - 
 *	1. 사람 3명이 SdkMini.java 쓰레드를 동시에 수행시킨다
 */
