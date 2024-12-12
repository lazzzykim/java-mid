package mid1.enumeration.ex1;


public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급 할인금액: " + basic);
        System.out.println("GOLD 등급 할인금액: " + gold);
        System.out.println("DIAMOND 등급 할인금액: " + diamond);

    }
}
