public class Merchandize {

    String name;
    double price;
    boolean promotion;

    public Merchandize() {
    }

    @Override
    public String toString() {
        return "Merchandize{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", promotion=" + promotion +
                '}';
    }

    public Merchandize(String name, double price, boolean promotion) {
        this.name = name;
        this.price = price;
        this.promotion = promotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
}
