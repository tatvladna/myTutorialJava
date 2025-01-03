package shop;

public class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating;
    }
}
