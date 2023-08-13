
import java.util.Scanner;

public class Problem14solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        String letterGrade = getLetterGrade(number);
        System.out.println("The letter grade is " + letterGrade);
    }

    public static String getLetterGrade(double number) {
        if (number >= 4.0) {
            return "A";
        } else if (number >= 3.7) {
            return "A-";
        } else if (number >= 3.3) {
            return "B+";
        } else if (number >= 3.0) {
            return "B";
        } else if (number >= 2.7) {
            return "B-";
        } else if (number >= 2.3) {
            return "C+";
        } else if (number >= 2.0) {
            return "C";
        } else if (number >= 1.7) {
            return "C-";
        } else if (number >= 1.3) {
            return "D+";
        } else if (number >= 1.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
