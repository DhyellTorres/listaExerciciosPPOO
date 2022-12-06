package telephone;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad implements Subject {
    private final PhoneModel model;
    private final List<Observer> observers;

    public KeyPad(PhoneModel model) {
        this.model = model;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 12;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
            updateObserver();
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.printAllNumbersCall();
        }
    }

    @Override
    public void updateObserver() {
        for (Observer observer : observers) {
            observer.printRecentNumber();
        }
    }
}
