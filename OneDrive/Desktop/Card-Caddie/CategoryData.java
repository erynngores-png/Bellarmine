import java.util.List;

public class CategoryData {

    public static final List<Category> CATEGORIES = List.of(
        new Category(
            "dining",
            "Dining",
            List.of("restaurants", "food", "eating out")
        ),
        new Category(
            "groceries",
            "Groceries",
            List.of("supermarket", "grocery store")
        ),
        new Category(
            "gas",
            "Gas",
            List.of("fuel", "gas station")
        ),
        new Category(
            "travel",
            "Travel",
            List.of("flights", "hotels", "airlines")
        )
    );
}
