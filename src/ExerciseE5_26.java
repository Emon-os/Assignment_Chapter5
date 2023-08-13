import java.util.Scanner;

public class ExerciseE5_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter altitude in meters (m) or feet (f): ");
        String altitudeStr = scanner.next();
        String unit = altitudeStr.substring(altitudeStr.length() - 1);

        if (!unit.equalsIgnoreCase("m") && !unit.equalsIgnoreCase("f")) {
            System.out.println("Invalid unit input");
            return;
        }

        double altitude;
        try {
            altitude = Double.parseDouble(altitudeStr.substring(0, altitudeStr.length() - 1));
        } catch (NumberFormatException e) {
            System.out.println("Invalid altitude input");
            return;
        }

        if (unit.equalsIgnoreCase("f")) {
            altitude *= 0.3048; // Convert feet to meters
        }

        Scanner temperatureScanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature;

        if (temperatureScanner.hasNextDouble()) {
            temperature = temperatureScanner.nextDouble();
        } else {
            System.out.println("Invalid temperature input");
            return;
        }

        if (unit.equalsIgnoreCase("m")) {
            if (temperature <= (15 - (altitude / 300))) {
                System.out.println("Solid");
            } else if (temperature >= (40 - (altitude / 300))) {
                System.out.println("Gaseous");
            } else {
                System.out.println("Liquid");
            }
        } else if (unit.equalsIgnoreCase("f")) {
            temperature = (temperature - 32) * 5 / 9;
            if (temperature <= (15 - (altitude / 300))) {
                System.out.println("Solid");
            } else if (temperature >= (40 - (altitude / 300))) {
                System.out.println("Gaseous");
            } else {
                System.out.println("Liquid");
            }
        }
    }
}
