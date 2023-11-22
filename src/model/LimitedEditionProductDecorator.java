package model;

public class LimitedEditionProductDecorator extends ProductDecorator {
    private String specialFeature;

    public LimitedEditionProductDecorator(Product decoratedProduct, String specialFeature) {
        super(decoratedProduct);
        this.specialFeature = specialFeature;
    }

    @Override
    public String getDecoratedDescription() {
        return super.getDecoratedDescription() + " [Limited Edition: " + specialFeature + "]";
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

}
