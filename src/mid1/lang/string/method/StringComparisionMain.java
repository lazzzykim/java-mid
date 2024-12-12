package mid1.lang.string.method;

public class StringComparisionMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "Hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2:" + str1.equals(str2));
        System.out.println("str1 equals str2:" + str1.equalsIgnoreCase(str2));
    }
}
