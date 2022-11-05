import java.util.ArrayList;

public class PostOffice implements Subject {

    private ArrayList<Mail> allMail;
    private ArrayList<Observer> observers;

    public PostOffice() {
        allMail = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addMail(Mail m){
        allMail.add(m);
        notifyObservers();
        allMail.remove(m);
    }
    public ArrayList<Mail> getState(){
        return allMail;
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            o.update(this);
        }
    }
}
