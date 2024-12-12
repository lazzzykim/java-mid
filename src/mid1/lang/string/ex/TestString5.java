package mid1.lang.string.ex;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        String fileName = str.substring(0, extIndex);
        String extName = str.substring(extIndex);

        System.out.println(extIndex);
        System.out.println(fileName);
        System.out.println(extName);
    }
}
