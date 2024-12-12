package mid1.wrapper;

public class AutoBoxingMain1 {

    public static void main(String[] args) {
        int value = 8;
//        Integer boxedValue = Integer.valueOf(value); // Integer.valueOf() 생략 가능
        Integer boxedValue = value;

        // Wrapper -> Primitive
//        int unBoxedValue = boxedValue.intValue(); // intValue() 생략 가능
        int unBoxedValue = boxedValue;

        System.out.println(boxedValue);
        System.out.println(unBoxedValue);
    }
}
