public class MultiLayered extends DecoratorCake {
    private static final int PRICE = 5;

    public MultiLayered() {
        super();
    }

    public MultiLayered(Cakes cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return "Multi-layered";
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + PRICE;
    }
}
