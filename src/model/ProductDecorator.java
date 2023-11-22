package model;

public abstract class ProductDecorator extends Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        super(decoratedProduct.getId(), decoratedProduct.getName(), decoratedProduct.getPrice());
        this.decoratedProduct = decoratedProduct;
    }
    public abstract String getDecoratedDescription();
}
