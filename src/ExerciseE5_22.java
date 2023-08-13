import java.util.Scanner;

public class ExerciseE5_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        String name = scanner.nextLine();

        System.out.print("Enter the hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        Paycheck paycheck = new Paycheck(name, hourlyWage, hoursWorked);
        paycheck.printPaycheck();
    }
}

class Paycheck {
    private String name;
    private double hourlyWage;
    private double hoursWorked;

    public Paycheck(String name, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public void printPaycheck() {
        double regularPay = hourlyWage * hoursWorked;
        double overtimePay = hoursWorked > 40 ? (hoursWorked - 40) * (hourlyWage * 1.5) : 0;

        double totalPay = regularPay + overtimePay;

        System.out.println("Paycheck for " + name);
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay: $" + totalPay);
    }
}
