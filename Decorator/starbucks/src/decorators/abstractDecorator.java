package decorators;

import boissons.Boisson;

public abstract class abstractDecorator extends Boisson{
    protected Boisson boisson;
    public abstractDecorator(Boisson boisson) {
        super();
        this.boisson = boisson;
    }
    public abstract String getDescription();

}
