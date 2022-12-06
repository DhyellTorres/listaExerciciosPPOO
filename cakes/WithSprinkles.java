package cakes;

public class WithSprinkles extends DecoratorCake {
    private static final int PRICE = 2;

    public WithSprinkles() {
        super();
    }

    public WithSprinkles(Cakes cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + PRICE;
    }
}
