public class StudentGradeAnalyzerV5 {
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
        return age >= 18;

    }

    public static boolean isPassing(double score) {
        return (score >= 40 && score <= 100);
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

    public static void printStudentGrade(double score) {
        String grade = calculateGrade(score);
        System.out.println("Your grade is " + grade);
        
        boolean passed = isPassing(score);
        if (passed) {
            System.out.println("You passed the exam");
        } else {
            System.out.println("You failed the exam");
        }
    }

    public static void printAgeCategory(int age){
        boolean maturity = isAdult(age);
        if (maturity) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }

    public static void main(String[] agrgs) {
        String studentName = "KorleyCodes";
        int studentAge = 20;
        double studentScore = 41.5;
        
        printStudentInfo(studentName, studentAge, studentScore);

        printStudentGrade(studentScore);

        printAgeCategory(studentAge);

        double doubledScore = doubleScore(studentScore);
        System.out.println("A double of your score gives " + doubledScore);
    }
}
