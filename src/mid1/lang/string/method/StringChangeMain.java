package mid1.lang.string.method;

public class StringChangeMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("7번 인덱스부터 문자열 " + str.substring(7));
        System.out.println("7부터 12까지 " + str.substring(7, 12));
        System.out.println("문자열 결합 : " + str.concat("!!!"));
        System.out.println("java를 world로 대체" + str.replace("Java", "World"));
        System.out.println("첫번째 JAVA를 World로" + str.replaceFirst("Java", "World"));

    }
}
