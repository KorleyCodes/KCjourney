public class StudentGradeAnalyzer_V1 {
    public static void main(String[] args) {
        String studname = "KorleyCodes";
        int studage = 20;
        double studeScore = 80.5;
        String grade;

        System.out.println("Programmer's name is " + studname + ". " + "Young dev is " + studage
                + " years of age. And his score is " + studeScore);

        if (studeScore >= 80) {
            grade = "A";
            System.out.println("Your grade = " + grade);
            System.out.println("you have passed");
        } else if (studeScore >= 70) {
            grade = "B";
            System.out.println("Your grade = " + grade);
            System.out.println("you have passed");
        } else if (studeScore >= 60) {
            grade = "C";
            System.out.println("Your grade = " + grade);
            System.out.println("you have passed");
        } else if (studeScore >= 50) {
            grade = "D";
            System.out.println("Your grade = " + grade);
            System.out.println("you have passed");
        } else if (studeScore >= 40) {
            grade = "E";
            System.out.println("Your grade = " + grade);
            System.out.println("you have passed");
        } else {
            grade = "F";
            System.out.println("Your grade = " + grade);
            System.out.println("you have failed");
        }

        if (studage >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println(" A double of your scores gives = " + studeScore * 2);

    }
}