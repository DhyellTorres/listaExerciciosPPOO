package telephone;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        // Add observers
        keyPad.registerObserver(screen);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
