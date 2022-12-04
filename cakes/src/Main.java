public class Main {
    public static void main(String[] args) {

        try {
            Order order = new Order();
            order.addCake(new BlueBerryCake());
            order.addCake(
                    new WithSaying(
                            new VanillaCake(),
                            "PLAIN!"));
            order.addCake(
                    new WithSaying(
                            new WithSprinkles(
                                    new VanillaCake()),
                            "FANCY"));
            order.addCake(
                    new WithSaying(
                            new WithSaying(
                                    new WithSprinkles(
                                            new WithSprinkles(
                                                    new StrawBerryCake(
                                                            new MultiLayered()))),
                                    "One of"),
                            "EVERYTHING"));

            order.printOrder();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
