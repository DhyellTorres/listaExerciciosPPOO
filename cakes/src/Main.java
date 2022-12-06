public class Main {
        public static void main(String[] args) {

                Order order = new Order();
                order.addCake(new BlueBerryCake());
                order.addCake(new WithSaying(new VanillaCake(), "PLAIN!"));
                order.addCake(new WithSaying(new WithSprinkles(new VanillaCake()), "FANCY!"));
                order.addCake(new MultiLayered(new StrawBerryCake(new WithSprinkles(
                                new WithSprinkles(new WithSaying(new WithSaying("EVERYTHING!"), "One of"))))));

                order.printOrder();
        }
}
