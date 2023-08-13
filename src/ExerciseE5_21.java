import java.util.Scanner;

public class ExerciseE5_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();

        Month month = new Month(monthNumber);
        System.out.println(month.getLength());
    }
}

class Month {
    private int monthNumber;

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getLength() {
        int days;
        if (monthNumber == 2) {
            days = 28;
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            days = 30;
        } else {
            days = 31;
        }
        return days + " days";
    }
}
