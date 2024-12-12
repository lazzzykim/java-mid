package mid1.enumeration.test;

public class AuthMain1 {

    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
//            System.out.println("grade = " + authGrade.name()
//                    + ", level = " + authGrade.getLevel()
//                    + ", description = " + authGrade.getDescription());
            printGrade(authGrade, authGrade.getLevel(), authGrade.getDescription());
        }
    }

    private static void printGrade(AuthGrade authGrade, int level, String description) {
        System.out.println("grade = " + authGrade + ", level = " + level + ", 설명 = " + description);
    }
}
