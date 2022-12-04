package ordera;

import java.util.ArrayList;
import java.util.List;

public abstract class StoreItem {
    private String name;
    private double price;

    private List<StoreItem> storeItems;

    protected StoreItem(String name, double price) {
        super();
        this.name = name;
        this.price = price;
        this.storeItems = new ArrayList<StoreItem>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void addItem(StoreItem item) {
        storeItems.add(item);
    }

    public void removeItem(StoreItem item) {
        storeItems.remove(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTotal() {
        double total = this.price;

        for (StoreItem item : storeItems) {
            total += item.calculateTotal();
        }
        return total;
    }
}
