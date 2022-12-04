public class VanillaCake extends DecoratorCake {

    public VanillaCake() {
        super();
    }

    public VanillaCake(Cakes cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return "Vanilla Cake";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
