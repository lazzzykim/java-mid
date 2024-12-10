package exception.basic.checked;

public class Service {
    Client client = new Client();

    //예외를 잡아서 처리하는 코드
    public void callCatch() {

        try {
            client.call();
        } catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    //체크 예외 던지는 코드, 던지려면 throws 메서드 필수 사용
    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}
