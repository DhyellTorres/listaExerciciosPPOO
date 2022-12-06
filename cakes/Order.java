package cakes;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private final List<Cakes> cakes = new ArrayList<>();

    public void addCake(Cakes cake) {
        cakes.add(cake);
    }

    public double getTotal() {
        double total = 0;
        for (Cakes cake : cakes) {
            total += cake.getPrice();
        }
        return total;
    }

    public void printOrder() {
        int total = 0;
        for (Cakes cake : cakes) {
            System.out.println(cake.getDescription() + " " + cake.getPrice());
            total += cake.getPrice();
        }
        System.out.println("Total: " + total);
    }
}
