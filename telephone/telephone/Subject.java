package telephone;

//interface subject telephone
public interface Subject {
  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void simulateKeyPresses(int numKeyPresses);

  public void updateObserver();

  public void notifyObservers();
}
