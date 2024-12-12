package mid1.lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원 A, 회원B의 처음 주소는 모두 서울

        System.out.println(memberA);
        System.out.println(memberB);

        // 회원B 주소 부산으로 변경
        memberB.getAddress().setValue("부산");
        System.out.println(memberA);
        System.out.println(memberB);
    }
}
