public class BlueBerryCake extends DecoratorCake {

    public BlueBerryCake() {
        super();
    }

    public BlueBerryCake(Cakes cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        if (cake != null) {
            return cake.getDescription() + ", BlueBerry Cake";
        } else {
            return "BlueBerry Cake";
        }
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + (super.getPrice() * 3);
    }
}
