package day11_arrays_collections;

public class GradeGridDemo {
    public static void main(String[] args) {

        double[][] grade = new double[2][3];

        grade[0][0] = 34.5;
        grade[0][1] = 70.74;
        grade[0][2] = 65.98;

        grade[1][0] = 78.91;
        grade[1][1] = 88;
        grade[1][2] = 92.45;

        for (int row = 0; row < grade.length; row++) {
            for (int col = 0; col < grade[row].length; col++) {
                System.out.println(grade[row][col]);
            }
            System.out.println();
        }

    }
}
