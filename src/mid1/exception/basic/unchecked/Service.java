package mid1.exception.basic.unchecked;

// UnChecked 예외는 예외를 잡거나 던지지 않아도 된다. 예외를 잡지 않으면 자동으로 밖으로 던진다.

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 예외를 잡지 않아도 자연스럽게 상위로 넘어간다.
    public void callThrow() {
        client.call();
    }
}
