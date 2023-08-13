import java.util.Scanner;

public class Problem8solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'strict' or 'lenient':");
        String mode = scanner.nextLine();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (mode.equals("strict")) {
            if (num1 < num2 && num2 < num3) {
                System.out.println("Increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else if (mode.equals("lenient")) {
            if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
                System.out.println("Increasing");
            } else if ((num1 >= num2 && num2 >= num3) || (num1 <= num2 && num2 <= num3)) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else {
            System.out.println("Invalid mode input");
        }
    }
}
