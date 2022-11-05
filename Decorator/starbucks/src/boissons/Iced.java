package boissons;

public class Iced extends Boisson{
    public Iced() {
        this.description="Iced coffee";
    }

    @Override
    public double cout() {
        return 8.00;
    }
}
