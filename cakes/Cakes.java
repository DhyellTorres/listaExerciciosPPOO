package cakes;

public abstract class Cakes {

    private final int PRICE = 20;

    public int getPrice() {
        return PRICE;
    }

    public abstract String getDescription();
}
