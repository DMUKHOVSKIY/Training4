import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 to have graphical interface or 2 to have console or 3 to have class computer:");
        int chose = scan.nextInt();

        switch (chose) {
            case 1:
                MainFrame frame = new MainFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                break;
            case 2:
                Calculator calc = new Calculator();
                calc.setX();
                calc.setY();
                calc.setOperation();
                double res = calc.result(calc.getX(), calc.getY(), calc.getOperation());
                System.out.println(Double.toString(calc.getX()) + calc.getOperation() + Double.toString(calc.getY()) + "=" + res);
                break;
            case 3:
                Computer pk = new Computer("rrr", 4, 4);
                pk.on(1);
                pk.off(1);
                System.out.println(pk.toString());
                break;
            default:
                System.out.println("What do yo want???");
        }

    }
}
