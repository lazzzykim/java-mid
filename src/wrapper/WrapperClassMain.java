package wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, valueOf를 사용하는것을 권장
        Integer integerObject = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println(newInteger);
        System.out.println(integerObject);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue();
        System.out.println(intValue);
        long longValue = longObj.longValue();
        System.out.println(longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObject));
        System.out.println("==: " + (newInteger.equals(integerObject)));
    }
}
