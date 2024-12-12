package mid1.enumeration.test;

import java.util.Scanner;

import static mid1.enumeration.test.AuthGrade.*;

public class AuthMain2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String auth = scanner.nextLine();
        // String과 Enum은 서로 비교할 수 없기 떄문에 ValueOf를 사용해서 AuthGrade타입으로 변환이 필요하다.
        AuthGrade selectedGrade = AuthGrade.valueOf(auth.toUpperCase());

        System.out.println("==메뉴 목록==");
        selectGrade(selectedGrade);

    }

    private static void printGrade(AuthGrade authGrade, int level, String description) {
        System.out.println("grade = " + authGrade + ", level = " + level + ", 설명 = " + description);
    }

    private static void selectGrade(AuthGrade grade) {
        if (grade.equals(GUEST)) {
            System.out.println("- 메인화면");
        } else if (grade.equals(LOGIN)) {
            System.out.println("- 메인화면");
            System.out.println("- 이메일 관리화면");
        } else if (grade.equals(ADMIN)) {
            System.out.println("- 메인화면");
            System.out.println("- 이메일 관리화면");
            System.out.println("- 관리자화면");
        }
    }
}
