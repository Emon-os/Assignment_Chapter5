
import java.util.Scanner;

public class ExerciseE5_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double spending = scanner.nextDouble();

        double coupon = getCoupon(spending);
        System.out.println("You win a discount coupon of $ " + coupon + ". (" + (int) (getCouponPercentage(coupon) * 100) + "% of your purchase)");
    }

    public static double getCoupon(double spending) {
        if (spending < 10) {
            return 0;
        } else if (spending <= 60) {
            return spending * 0.08;
        } else if (spending <= 150) {
            return spending * 0.10;
        } else if (spending <= 210) {
            return spending * 0.12;
        } else {
            return spending * 0.14;
        }
    }

    public static double getCouponPercentage(double coupon) {
        if (coupon < 10) {
            return 0;
        } else if (coupon <= 60) {
            return 0.08;
        } else if (coupon <= 150) {
            return 0.10;
        } else if (coupon <= 210) {
            return 0.12;
        } else {
            return 0.14;
        }
    }
}
