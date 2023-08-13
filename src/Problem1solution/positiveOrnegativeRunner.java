package Problem1solution;

import java.util.Scanner;

public class positiveOrnegativeRunner {
    public static void main(String[] args) {
        positiveOrNegative number1 = new positiveOrNegative();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        number1.positiveOrNegativeOrZero(number);
    }
}
