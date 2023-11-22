package model;

public class ProductFactory {
    public static Product createProduct(String type, String id, String name, double price) {
        switch (type.toLowerCase()) {
            case "electronic":
                return new ElectronicProduct(id, name, price);
            case "food":
                return new FoodProduct(id, name, price);
            case "apparel":
                return new ApparelProduct(id, name, price);
            case "book":
                return new BookProduct(id, name, price);
            case "furniture":
                return new FurnitureProduct(id, name, price);
            case "toy":
                return new ToyProduct(id, name, price);

            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
