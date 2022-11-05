package Toppings;

import pizza.Pizza;

public class toppingDecorator implements Pizza {
    protected Pizza tempPizza;

    public toppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }
    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
