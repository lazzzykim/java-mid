package mid1.enumeration.test1;

import mid1.enumeration.test.AuthGrade;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade = " + value.name() + ", level = " + value.getLevel() +
                    ", description = " + value.getDescription());
        }
    }
}