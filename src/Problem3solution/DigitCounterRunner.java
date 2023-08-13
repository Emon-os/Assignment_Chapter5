package Problem3solution;

import java.util.Scanner;

public class DigitCounterRunner {
    public static void main(String[] args) {
        DigitCounter number1 = new DigitCounter();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int digitcount = number1.digitcount(number);
        System.out.println("The number of digit : "+digitcount);
    }
}
