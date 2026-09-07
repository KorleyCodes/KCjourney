public class StudentGradeAnalyzerV2 {
    public static void main(String[] args) {
        String studentName = "KorleyCodes";
        int studentAge = 20;
        double studentScore = 41.5;
        String grade;

        System.out.println("Programmer's name is " + studentName + ". Young dev is " + studentAge
                + " years of age. And his score is " + studentScore);
        if (studentScore > 100 || studentScore < 0) {
            System.out.println("Invalid score");
        } else if (studentScore >= 80) {
            grade = "A";
            System.out.println("Your grade = " + grade);

        } else if (studentScore >= 70) {
            grade = "B";
            System.out.println("Your grade = " + grade);
        } else if (studentScore >= 60) {
            grade = "C";
            System.out.println("Your grade = " + grade);

        } else if (studentScore >= 50) {
            grade = "D";
            System.out.println("Your grade = " + grade);
            ;
        } else if (studentScore >= 40) {
            grade = "E";
            System.out.println("Your grade = " + grade);

        } else {
            grade = "F";
            System.out.println("Your grade = " + grade);
        }

        if (studentScore >= 40 && studentScore <= 100) {
            System.out.println("You have passed the exam");
            System.out.println("A double of your scores gives = " + studentScore * 2);
        } else {
            System.out.println("You have failed the exam");
        }

        if (studentAge >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

    }
}
