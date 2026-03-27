import java.util.List;

public class Category {
    private String id;
    private String name;
    private List<String> aliases;

    public Category(String id, String name, List<String> aliases) {
        this.id = id;
        this.name = name;
        this.aliases = aliases;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getAliases() { return aliases; }
}