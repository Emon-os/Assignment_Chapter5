import java.util.Scanner;

public class ExerciseE5_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        char unit = scanner.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            if (temperature <= 0) {
                System.out.println("Solid");
            } else if (temperature >= 100) {
                System.out.println("Gaseous");
            } else {
                System.out.println("Liquid");
            }
        } else if (unit == 'F' || unit == 'f') {
            double celsius = (temperature - 32) * 5 / 9;
            if (celsius <= 0) {
                System.out.println("Solid");
            } else if (celsius >= 100) {
                System.out.println("Gaseous");
            } else {
                System.out.println("Liquid");
            }
        } else {
            System.out.println("Invalid unit");
        }
    }
}
