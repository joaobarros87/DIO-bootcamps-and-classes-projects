package dio.com.br;

public class Calc {
    public static void area(double side) {

        System.out.println("Square area:" + side * side);
    }
    public static void area(double side1, double side2) {

        System.out.println("Rectangle area: " + side1 * side2);
    }
    public static void area(double largerBase, double smallerBase, double height) {

        System.out.println("Triangle area: " + ((largerBase+smallerBase)*height) / 2);
    }
}
