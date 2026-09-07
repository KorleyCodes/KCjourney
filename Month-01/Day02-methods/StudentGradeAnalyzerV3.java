public class StudentGradeAnalyzerV3 {
    public static String calculateGrade(double score) {
        if (score > 100 || score < 0) {
            return "---";
        } else if (score >= 80) {
            return "A";

        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";

        } else if (score >= 50) {
            return "D";
        } else if (score >= 40) {
            return "E";
        } else {
            return "F";
        }

    }

    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isPassing(double score) {
        if (score >= 40 && score <= 100) {
            return true;
        } else {
            return false;
        }

    }

    public static double doubleScore(double score) {
        if (score > 100 || score < 0) {
            return 0;
        } else {
            return score * 2;
        }
    }

    public static void printStudentInfo(String name, int age, double score) {
        System.out.println("Programmer's name is " + name + ". Young dev is " + age
                + " years of age. And his score is " + score);

    }

    public static void main(String[] agrgs) {
        printStudentInfo("KorleyCodes", 20, 56.8);

        String grade = calculateGrade(56.8);
        System.out.println("Your grade is " + grade);

        boolean maturity = isAdult(20);
        if (maturity) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        boolean passed = isPassing(56.8);
        if (passed) {
            System.out.println("You passed the exam");
        } else {
            System.out.println("You failed the exam");
        }
        double DbScore = doubleScore(56.8);
        System.out.println("A double of your score gives " + DbScore);
    }

}
