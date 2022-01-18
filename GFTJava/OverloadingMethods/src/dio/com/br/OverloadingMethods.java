package dio.com.br;

public class OverloadingMethods {
    public static void main(String[] args) {

        //calc

        System.out.println("Square, Rectangle and Triangle Area Calculator!");
        System.out.println("________________________________________________");
        Calc.area(3);
        Calc.area(4, 2);
        Calc.area(5, 2, 4);

    }
}
