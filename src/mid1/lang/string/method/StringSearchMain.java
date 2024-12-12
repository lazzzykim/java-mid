package mid1.lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello, java! welcome to Java world.";

        System.out.println("문자열에 java가 포함되어 있는지 : " + str.contains("java"));
        System.out.println("java의 첫번째 인덱스: " + str.indexOf("Java"));
        System.out.println("Java의 마지막 인덱스 : " + str.lastIndexOf("Java"));
    }
}
