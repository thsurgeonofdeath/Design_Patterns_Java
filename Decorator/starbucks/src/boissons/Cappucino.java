package boissons;

public class Cappucino extends Boisson{
    public Cappucino() {
        this.description="Capuccinooo";
    }

    @Override
    public double cout() {
        return 10.00;
    }
}
