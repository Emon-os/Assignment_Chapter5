import java.util.Scanner;

public class ExerciseE5_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (Math.abs(num1 - num2) < 0.01) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }
}
