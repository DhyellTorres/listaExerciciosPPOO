package cakes;

public class WithSaying extends DecoratorCake {
    private final String saying;

    public WithSaying(String saying) {
        super();
        this.saying = saying;
    }

    public WithSaying(Cakes cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + String.format(" With Saying: %s", saying);
    }

    @Override
    public int getPrice() {
        return cake.getPrice();
    }
}
