import java.util.Scanner;

public class ExerciseE5_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        double tax = calculateIncomeTax(income);
        System.out.println("Income tax: $" + tax);
    }

    public static double calculateIncomeTax(double income) {
        if (income <= 50000) {
            return income * 0.01;
        } else if (income <= 75000) {
            return 500 + (income - 50000) * 0.02;
        } else if (income <= 100000) {
            return 1500 + (income - 75000) * 0.03;
        } else if (income <= 250000) {
            return 3000 + (income - 100000) * 0.04;
        } else if (income <= 500000) {
            return 12000 + (income - 250000) * 0.05;
        } else {
            return 27000 + (income - 500000) * 0.06;
        }
    }
}
