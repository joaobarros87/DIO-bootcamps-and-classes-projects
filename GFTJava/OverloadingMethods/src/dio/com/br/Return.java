package dio.com.br;

public class Return {
    public static double area(double side) {

        return side * side;
    }

    public static double area(double side1, double side2){

        return side1 * side2;
    }

    public static double area(double largerBase, double smallerBase, double height) {

        return((largerBase+smallerBase)*height) / 2;
    }
}
