import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Card {
    String symbol;
    String value;

    public Card(String symbol, String value) {
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getValue() {
        return value;
    }

}

public class CardCollection {
    Collection<Card> cards = new ArrayList<>();

    public void addCard(String symbol, String value) {
        cards.add(new Card(symbol, value));
    }

    public void findCardsBySymbol(String symbol) {
        boolean found = false;
        System.out.println("Cards with symbol '" + symbol + "':");
        for (Card card : cards) {
            if (card.getSymbol().equalsIgnoreCase(symbol)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards with symbol '" + symbol + "' found.");
        }
    }

    public void displayAllCards() {
        System.out.println("\nAll Cards:");
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        CardCollection collection = new CardCollection();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cards to add: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter card value ");
            String value = scanner.nextLine();
            System.out.print("Enter card symbol");
            String symbol = scanner.nextLine();
            collection.addCard(symbol, value);
        }

        collection.displayAllCards();

        System.out.print("\nEnter symbol to search for: ");
        String searchSymbol = scanner.nextLine();
        collection.findCardsBySymbol(searchSymbol);

        scanner.close();
    }
}
