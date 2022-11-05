package decorators;

import boissons.Boisson;

public class Chocolate extends abstractDecorator{
    public Chocolate(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" with chocolate";
    }
    @Override
    public double cout() {
        return 0.5 + boisson.cout();
    }
}
