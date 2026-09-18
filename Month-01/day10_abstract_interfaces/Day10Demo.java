package day10_abstract_interfaces;

public class Day10Demo {
    public static void main(String[] args) {
        Reportable report = new Student("KorleyCodes", 20, 91.50);
        System.out.println(report.generateReport());
    }
}
