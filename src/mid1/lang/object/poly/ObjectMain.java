package mid1.lang.object.poly;

public class ObjectMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString(); // 묵시적 상속으로 메서드 사용가능
        System.out.println(string);
    }
}
