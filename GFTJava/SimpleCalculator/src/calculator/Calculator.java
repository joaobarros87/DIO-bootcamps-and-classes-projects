package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Insert first value: ");
        a = scan.nextInt();
        System.out.println("Insert second value: ");
        b = scan.nextInt();

        double sum = sum(a, b);
        double subtract = subtract(a, b);
        double multiply = multiply(a, b);
        double divide = divide(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + subtract);
        System.out.println("Mult: " + multiply);
        System.out.println("Div: " + divide);


    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
}
