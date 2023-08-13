package Problem4solution;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class LetterEqualsRunner {
    public static void main(String[] args) {
        LetterEquals name1 = new LetterEquals();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        name1.letterequals(name);

    }
}
