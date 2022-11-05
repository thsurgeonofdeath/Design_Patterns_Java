public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        double result = state*state + 9;
        System.out.println("*********** ObserverImpl1 *************");
        System.out.println("New Update: state equals "+state);
        System.out.println("Result equals "+result);
    }
}
