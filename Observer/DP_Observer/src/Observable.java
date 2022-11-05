public interface Observable {
    public void subscribe(Observer o); //Add observer
    public void unsubscribe(Observer o); //remove observer
    public void notifyObservers();
}
