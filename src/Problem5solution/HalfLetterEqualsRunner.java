package Problem5solution;

import java.util.Scanner;

public class HalfLetterEqualsRunner {
    public static void main(String[] args) {
        HalfLetterEquals name1 = new HalfLetterEquals();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String name = input.nextLine();
        name1.halfletterequal(name);
    }
}
