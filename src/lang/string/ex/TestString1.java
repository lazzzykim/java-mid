package lang.string.ex;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean isTrue = false;
        if (url.startsWith("https://")) {
            isTrue = true;
        }

        System.out.println(isTrue);
    }
}
