package orders;

import java.util.ArrayList;
import java.util.List;

public abstract class StoreItem {
    private String name;
    private double price;

    private List<StoreItem> storedItems;

    protected StoreItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.storedItems = new ArrayList<StoreItem>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void addItem(StoreItem item) {
        storedItems.add(item);
    }

    public void removeItem(StoreItem item) {
        storedItems.remove(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTotal() {
        double total = this.price;

        for (StoreItem item : storedItems) {
            total += item.calculateTotal();
        }
        return total;
    }
}
