package lang.string.ex;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse().toString();
        System.out.println(stringBuilder);
    }
}
