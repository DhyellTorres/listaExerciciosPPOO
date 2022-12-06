public class BlueBerryCake extends DecoratorCake {

    public BlueBerryCake() {
        super();
    }

    public BlueBerryCake(Cakes cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " BlueBerry Cake";
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + (super.getPrice() * 3);
    }
}
