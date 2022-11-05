public class Test {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl1();

        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
        observable.setState(55);
        observable.unsubscribe(o1);
        observable.setState(33);
        observable.setState(22);
        observable.unsubscribe(o2);
        observable.unsubscribe(o3);
        // using lambda expression to quickly create and subscribe a new Observer
        observable.subscribe( obs -> {
            System.out.println("******* quickly creating an observer **********");
        });
        observable.setState(10);

    }
}
