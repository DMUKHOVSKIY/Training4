import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);

    private double x;
    private double y;
    private char operation;

    Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Calculator() {
    }

    void setX() {
        System.out.println("Enter x:");
        this.x = scan.nextDouble();
    }

    void setY() {
        System.out.println("Enter y:");
        this.y = scan.nextDouble();
    }

    void setOperation() {
        System.out.println("Enter operation:");
        this.operation = scan.next().charAt(0);
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    char getOperation() {
        return operation;
    }

    double result(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                System.out.println("Enter correct operation!!!");
        }
        return 0;
    }

}
