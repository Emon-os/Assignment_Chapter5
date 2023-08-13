import java.util.Scanner;

public class ExerciseE5_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Invalid input");
            return;
        }

        char c = Character.toLowerCase(input.charAt(0));
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
