# my.sample.syncronizedExample


플래그값 	public static boolean ISSEND = false; 가 thread safe 하지 않게 작동하는 모습과,
syncronized 를 이용하여 해결하는 모습을 확인하는 예제입니다.

SdkMini.java
- 로직 설명 - 
1. gps, ble, network 처리결과를 1개씩 수행한다
2. 처리 결과를 서버로 전송한다 // sendServer();
3. 서버 전송까지 성공 했다면 모든 로직을 중단한다.



People.java
- 로직 설명 - 
1. 사람 3명이 SdkMini.java 쓰레드를 동시에 수행시킨다



