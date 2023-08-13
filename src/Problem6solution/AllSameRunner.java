package Problem6solution;

import java.util.Scanner;

public class AllSameRunner {
    public static void main(String[] args) {
        AllSame number1 = new AllSame();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        number1.AllNumberSame(num1,num2,num3);
    }
}
