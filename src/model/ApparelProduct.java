package model;

public class ApparelProduct extends Product {
    private String size;
    private String material;

    public ApparelProduct(String id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    public boolean isSizeMatching(String userSize) {
        return this.size.equals(userSize);
    }

    public String careInstructions() {
        return "Care instructions for " + material;
    }

}
