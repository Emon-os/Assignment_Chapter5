import java.util.Scanner;
import java.util.Arrays;

public class ExerciseE5_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.next();
        }

        Arrays.sort(strings);
        System.out.println(String.join(" ", strings));
    }
}

