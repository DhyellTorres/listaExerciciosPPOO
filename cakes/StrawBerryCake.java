package cakes;

public class StrawBerryCake extends DecoratorCake {

    public StrawBerryCake() {
        super();
    }

    public StrawBerryCake(Cakes cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "Strawberry Cake";
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + (super.getPrice() * 2);
    }
}
