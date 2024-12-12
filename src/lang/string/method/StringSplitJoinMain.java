package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String s : split) {
            joinStr += s + "-";
        }

        System.out.println("joinStr = " + joinStr);

        String joinedStr = String.join("-", "a", "B", "c");
        System.out.println(joinedStr);

        String result = String.join("-", split);
        System.out.println(result);
    }
}
