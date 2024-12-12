package mid1.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        int value = 8;
        Integer boxedValue = value; // auto boxing

        // Wrapper -> Primitive
        int unBoxedValue = boxedValue; // auto unboxing

        System.out.println(boxedValue);
        System.out.println(unBoxedValue);
    }
}
