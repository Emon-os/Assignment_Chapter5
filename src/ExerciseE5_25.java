import java.util.Scanner;

public class ExerciseE5_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("C")) {
            temperature -= (temperature / 300) * 1.0;
            if (temperature <= 0) {
                System.out.println("Solid");
            } else if (temperature >= 100) {
                System.out.println("Gaseous");
            } else {
                System.out.println("Liquid");
            }
        } else if (unit.equalsIgnoreCase("F")) {
            temperature = (temperature - 32) * 5 / 9;
            temperature -= (temperature / 300) * 1.0;
            if (temperature <= 0) {
                System.out.println("Solid");
            } else if (temperature >= 100) {
                System.out.println("Gaseous");
            } else {
                System.out.println("Liquid");
            }
        } else {
            System.out.println("Invalid unit");
        }
    }
}
