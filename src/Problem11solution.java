
import java.util.Scanner;

public class Problem11solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();

        String direction;
        if (angle < 0) {
            angle = (angle % 360) + 360;
        } else {
            angle = angle % 360;
        }

        if (angle >= 337.5 || angle < 22.5) {
            direction = "N";
        } else if (angle >= 22.5 && angle < 67.5) {
            direction = "NE";
        } else if (angle >= 67.5 && angle < 112.5) {
            direction = "E";
        } else if (angle >= 112.5 && angle < 157.5) {
            direction = "SE";
        } else if (angle >= 157.5 && angle < 202.5) {
            direction = "S";
        } else if (angle >= 202.5 && angle < 247.5) {
            direction = "SW";
        } else if (angle >= 247.5 && angle < 292.5) {
            direction = "W";
        } else {
            direction = "NW";
        }

        System.out.println("Nearest compass direction: " + direction);
    }
}

