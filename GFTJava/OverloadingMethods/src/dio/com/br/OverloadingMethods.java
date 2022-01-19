package dio.com.br;

public class OverloadingMethods {
    public static void main(String[] args) {

        //calc
//
//        System.out.println("Square, Rectangle and Triangle Area Calculator!");
//        System.out.println("________________________________________________");
//        Calc.area(3);
//        Calc.area(4, 2);
//        Calc.area(5, 2, 4);

        //returns
        System.out.println("Square, Rectangle and Triangle Area Calculator with Return!");
        System.out.println("________________________________________________");
        double squareArea = Return.area(5);
        System.out.println("Square area is: " + squareArea);
        double rectangleArea = Return.area(7,9);
        System.out.println("Rectangle area is: " + rectangleArea);
        double triangleArea = Return.area(9,10,8);
        System.out.println("Triangle area is: " + triangleArea);

    }
}
