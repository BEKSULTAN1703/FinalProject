package model;

public class DiscountedProductDecorator extends ProductDecorator {
    private double discountRate;

    public DiscountedProductDecorator(Product decoratedProduct, double discountRate) {
        super(decoratedProduct);
        this.discountRate = discountRate;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discountRate);
    }

    @Override
    public String getDecoratedDescription() {
        return super.getDecoratedDescription() + " ( discount" + (discountRate * 100) + "%)";
    }
}
