import java.util.List;
import java.util.ArrayList;

public class Order {
    private final List<Cakes> cakes = new ArrayList<>();

    void addCake(Cakes cake) {
        cakes.add(cake);
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
