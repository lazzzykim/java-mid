package mid1.lang.string.ex;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        //분리하기
        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        String joinString = String.join("->", splitFruits);
        System.out.println(joinString);
    }
}
