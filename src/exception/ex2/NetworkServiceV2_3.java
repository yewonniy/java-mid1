package exception.ex2;


public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        /**
         * 정상 흐름을 모두 try 블럭에 모아서 나열 !!!!
         * 예외 흐름은 모두 catch 부분에
         */
        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
    }
}
