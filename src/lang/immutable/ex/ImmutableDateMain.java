package lang.immutable.ex;

public class ImmutableDateMain {

    public static void main(String[] args) {

        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1= =" + date1);
        System.out.println("date2= =" + date2);

        System.out.println("2025 -> date1");
        date1 = date1.change(2025, 1, 1);
        System.out.println("date1= =" + date1);
        System.out.println("date2= =" + date2);

    }
}
