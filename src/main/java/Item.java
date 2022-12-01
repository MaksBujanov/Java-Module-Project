public class Item {
    String productName;
    double stoimost;

    Item(String productName, double stoimost) {
        this.productName = productName;
        this.stoimost = stoimost;
    }

    public String productName() {
        return productName;
    }
    public double getstoimost() {
        return stoimost;
    }
}

