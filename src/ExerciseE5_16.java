import java.util.Scanner;

public class ExerciseE5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNotation = scanner.nextLine();

        Card card = new Card(cardNotation);
        String description = card.getDescription();
        System.out.println(description);
    }
}

class Card {
    private String cardNotation;

    public Card(String cardNotation) {
        this.cardNotation = cardNotation;
    }

    public String getDescription() {
        if (cardNotation.length() != 2) {
            return "Unknown";
        }

        char value = cardNotation.charAt(0);
        char suit = cardNotation.charAt(1);
        String valueDescription;
        String suitDescription;

        switch (value) {
            case 'A':
                valueDescription = "Ace";
                break;
            case '2':
                valueDescription = "2";
                break;
            // ... other cases for values
            default:
                valueDescription = "Unknown";
        }

        switch (suit) {
            case 'D':
                suitDescription = "Diamonds";
                break;
            case 'H':
                suitDescription = "Hearts";
                break;
            // ... other cases for suits
            default:
                suitDescription = "Unknown";
        }

        return valueDescription + " of " + suitDescription;
    }
}
