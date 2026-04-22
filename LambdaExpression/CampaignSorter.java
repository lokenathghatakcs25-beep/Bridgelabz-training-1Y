package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;
    private double rating;
    private int discountPercent;

    public Product(String name, double price, double rating, int discountPercent) {
        this.name            = name;
        this.price           = price;
        this.rating          = rating;
        this.discountPercent = discountPercent;
    }

    public String  getName()            { return name; }
    public double  getPrice()           { return price; }
    public double  getRating()          { return rating; }
    public int     getDiscountPercent() { return discountPercent; }
    public double  getDiscountedPrice() { return price * (1 - discountPercent / 100.0); }

    @Override
    public String toString() {
        return String.format("%-28s | Price: $%6.2f | Rating: %.1f★ | Discount: %2d%% | Final: $%6.2f",
                name, price, rating, discountPercent, getDiscountedPrice());
    }
}

 public class CampaignSorter {

    private final Map<String, Comparator<Product>> strategies = new LinkedHashMap<>();

    public CampaignSorter() {
        strategies.put("Budget Hunt",
                (p1, p2) -> Double.compare(p1.getDiscountedPrice(), p2.getDiscountedPrice()));

        strategies.put("Premium Picks",
                Comparator.comparingDouble(Product::getRating).reversed()
                        .thenComparingDouble(Product::getPrice));

        strategies.put("Flash Sale",
                (p1, p2) -> Integer.compare(p2.getDiscountPercent(), p1.getDiscountPercent()));

        strategies.put("High-End Showcase",
                (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));

        strategies.put("Best Value",
                (p1, p2) -> Double.compare(
                        p2.getRating() / p2.getDiscountedPrice(),
                        p1.getRating() / p1.getDiscountedPrice()));

        strategies.put("Editor's Score",
                (p1, p2) -> Double.compare(score(p2), score(p1)));
    }

    private double score(Product p) {
        return (p.getRating() * 40) + (p.getDiscountPercent() * 0.5) - (p.getPrice() * 0.05);
    }

    public void runCampaign(String campaignName, List<Product> catalog) {
        Comparator<Product> comparator = strategies.get(campaignName);
        if (comparator == null) {
            System.out.println("Unknown campaign: " + campaignName);
            return;
        }

        List<Product> sorted = catalog.stream()
                .sorted(comparator)
                .collect(Collectors.toList());

        System.out.println("\n╔══════════════════════════════════════════════════════════════════╗");
        System.out.printf ("║  🛒 Campaign: %-51s║%n", campaignName);
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");

        int rank = 1;
        for (Product p : sorted) {
            System.out.printf("  #%d  %s%n", rank++, p);
        }
    }

    public void addCampaign(String name, Comparator<Product> comparator) {
        strategies.put(name, comparator);
    }

    public Set<String> getCampaignNames() { return strategies.keySet(); }
}
class ECommerceStorefront {
    public static void main(String[] args) {

        List<Product> catalog = Arrays.asList(
                new Product("Sony WH-1000XM5 Headphones",  349.99, 4.8, 15),
                new Product("Samsung 4K Smart TV 55\"",    699.99, 4.5, 30),
                new Product("Instant Pot Duo 7-in-1",       89.99, 4.7, 10),
                new Product("Apple AirPods Pro (2nd Gen)", 249.99, 4.6,  5),
                new Product("Dyson V15 Vacuum Cleaner",    649.99, 4.9, 20),
                new Product("Kindle Paperwhite",            139.99, 4.7, 25),
                new Product("Logitech MX Master 3 Mouse",   99.99, 4.6, 40),
                new Product("GoPro HERO12 Black",          399.99, 4.4, 10),
                new Product("Nespresso Vertuo Pop",         89.99, 4.3, 50),
                new Product("iPad Air (5th Gen)",          599.99, 4.8,  8)
        );

        CampaignSorter sorter = new CampaignSorter();

        for (String campaign : sorter.getCampaignNames()) {
            sorter.runCampaign(campaign, catalog);
        }

        sorter.addCampaign("Alphabetical",
                (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        sorter.runCampaign("Alphabetical", catalog);
    }
}
