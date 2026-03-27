import java.util.Map;

public class Card {
    private String id;
    private String name;
    private String issuer;
    private String network;
    private int annualFee;
    private Map<String, Double> rewards;

    public Card(String id,
                String name,
                String issuer,
                String network,
                int annualFee,
                Map<String, Double> rewards) {
        this.id = id;
        this.name = name;
        this.issuer = issuer;
        this.network = network;
        this.annualFee = annualFee;
        this.rewards = rewards;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getIssuer() { return issuer; }
    public String getNetwork() { return network; }
    public int getAnnualFee() { return annualFee; }
    public Map<String, Double> getRewards() { return rewards; }

    public double getRewardForCategory(String category) {
        return rewards.getOrDefault(category, rewards.getOrDefault("default", 0.0));
    }
}