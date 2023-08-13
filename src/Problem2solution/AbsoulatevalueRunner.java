package Problem2solution;

import java.util.Scanner;

public class AbsoulatevalueRunner {
    public static void main(String[] args) {
        Absoulatevalue number1 = new Absoulatevalue();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        number1.numberCheck(number);
    }
}
