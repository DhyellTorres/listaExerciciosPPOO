package ordera;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        StoreItem box = new Box("Box completa", 0.25);

        box.addItem(product());

        out.println("Seu carrinho de compras: " + box.getName() + " " + box.calculateTotal());
    }

    public static StoreItem product() {
        StoreItem patoPa = new Product("Pato Pa", 1.25);
        StoreItem foneDicria = new Product("Fone Di cria", 300.15);

        StoreItem otherBox = new Box("Outra caixa", 0.25);
        otherBox.addItem(patoPa);
        otherBox.addItem(foneDicria);

        StoreItem box = new Box("Box", 0.25);
        box.addItem(otherBox);
        out.println("Seu carrinho de compras: " + box.getName() + " " + box.calculateTotal());

        return box;
    }
}
