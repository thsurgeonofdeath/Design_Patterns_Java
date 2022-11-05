public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        if((state%2)==0){
            ++counter;
        }
        System.out.println("*********** ObserverImpl2 *************");
        System.out.println("New Update: state equals "+state);
        System.out.println("Result equals "+((state%2)==0? "Pair" : "Impair"));
        System.out.println("the counter equals "+counter);
    }
}
