
import java.util.Scanner;

public class Problem13solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letterGrade = scanner.nextLine();

        double numericGrade = getNumericGrade(letterGrade);
        System.out.println("The numeric value is " + numericGrade);
    }

    public static double getNumericGrade(String letterGrade) {
        char grade = letterGrade.charAt(0);
        double numericValue;

        switch (grade) {
            case 'A':
                numericValue = 4.0;
                break;
            case 'B':
                numericValue = 3.0;
                break;
            case 'C':
                numericValue = 2.0;
                break;
            case 'D':
                numericValue = 1.0;
                break;
            case 'F':
                numericValue = 0.0;
                break;
            default:
                numericValue = -1.0;
        }

        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                numericValue += 0.3;
            } else if (modifier == '-') {
                numericValue -= 0.3;
            }
        }

        return numericValue;
    }
}

