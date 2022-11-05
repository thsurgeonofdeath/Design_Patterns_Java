package Toppings;

import pizza.Pizza;

public class Mozarella extends toppingDecorator{
    public Mozarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }
    public String getDescription() {
        return tempPizza.getDescription() + ",Mozzarella";
    }
    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}
