import java.util.List;

public class Store {
    private String id;
    private String name;
    private String category;
    private List<String> restrictedNetworks;
    private String notes;

    public Store(String id, String name, String category,
                 List<String> restrictedNetworks, String notes) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.restrictedNetworks = restrictedNetworks;
        this.notes = notes;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public List<String> getRestrictedNetworks() { return restrictedNetworks; }
    public String getNotes() { return notes; }
}