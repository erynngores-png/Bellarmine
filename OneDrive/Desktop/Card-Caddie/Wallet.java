import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String id;
    private String name;
    private List<Card> cards;

    // Constructor
    public Wallet(String id, String name) {
        this.id = id;
        this.name = name;
        this.cards = new ArrayList<>(); // Start with empty list
    }

    // Add a card to the wallet
    public void addCard(Card card) {
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    // Remove a card from the wallet
    public void removeCard(Card card) {
        cards.remove(card);
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<Card> getCards() { return cards; }

    // Convenience: Check if wallet has a specific card
    public boolean hasCard(Card card) {
        return cards.contains(card);
    }
}