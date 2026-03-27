import java.util.List;
import java.util.Map;

public class StoreData {
public static final List<Card> CARDS = List.of(
    new Card(
        "chase_sapphire_preferred",
        "Chase Sapphire Preferred",
        "Chase",
        "Visa",
        95,
        Map.of(
            "travel", 5.0,
            "dining", 3.0,
            "groceries", 1.0,
            "gas", 1.0,
            "default", 1.0
        )
    ),
    new Card(
        "amex_gold",
        "American Express Gold Card",
        "American Express",
        "Amex",
        250,
        Map.of(
            "dining", 4.0,
            "groceries", 4.0,
            "travel", 3.0,
            "gas", 1.0,
            "default", 1.0
        )
    ),
    new Card(
        "citi_costco",
        "Costco Anywhere Visa",
        "Citi",
        "Visa",
        0,
        Map.of(
            "gas", 4.0,
            "travel", 3.0,
            "dining", 3.0,
            "groceries", 2.0,
            "default", 1.0
        )
    ),
    new Card(
        "capital_one_savor",
        "Capital One SavorOne",
        "Capital One",
        "Mastercard",
        0,
        Map.of(
            "dining", 3.0,
            "groceries", 3.0,
            "travel", 1.0,
            "gas", 1.0,
            "default", 1.0
        )
    ),
    new Card(
        "amex_blue_cash_preferred",
        "Blue Cash Preferred",
        "American Express",
        "Amex",
        95,
        Map.of(
            "groceries", 6.0,
            "gas", 3.0,
            "dining", 1.0,
            "travel", 1.0,
            "default", 1.0
        )
    ),
    new Card(
        "chase_freedom_unlimited",
        "Chase Freedom Unlimited",
        "Chase",
        "Visa",
        0,
        Map.of(
            "travel", 5.0,
            "dining", 3.0,
            "groceries", 1.0,
            "gas", 1.0,
            "default", 1.5
        )
    ),
    new Card(
        "citi_double_cash",
        "Citi Double Cash",
        "Citi",
        "Mastercard",
        0,
        Map.of(
            "dining", 2.0,
            "groceries", 2.0,
            "gas", 2.0,
            "travel", 2.0,
            "default", 2.0
        )
    ),
    new Card(
        "wells_fargo_autograph",
        "Wells Fargo Autograph",
        "Wells Fargo",
        "Visa",
        0,
        Map.of(
            "dining", 3.0,
            "travel", 3.0,
            "gas", 3.0,
            "groceries", 1.0,
            "default", 1.0
        )
    )
);
}