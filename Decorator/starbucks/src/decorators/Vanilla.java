package decorators;

import boissons.Boisson;

public class Vanilla extends abstractDecorator{
    public Vanilla(Boisson boisson) {
        super(boisson);
    }
    @Override
    public double cout() {
        return 1.25 + boisson.cout();
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" with vanilla";
    }
}
