import java.util.Scanner;
import static java.lang.Math.abs;


public class Main {

    public static void main (String[] args) {

        WingedFanPrinter fanPrinter = WingedFanPrinterFactory.getWingedFanPrinter(FanPrinterType.QuadrupleSymmetry);
        Scanner sc = new Scanner(System.in);
        int input;

        while ((input = sc.nextInt()) != 0) {
            if (input > 0)
                fanPrinter.printFan(input, FanDirection.Clockwise);
            else
                fanPrinter.printFan(abs(input), FanDirection.CounterClockwise);
            System.out.println();
        }

        sc.close();
    }
}
