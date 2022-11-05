package Toppings;

import pizza.Pizza;

public class tomatoSauce extends toppingDecorator{
    public tomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tomato sauce");
    }
    public String getDescription() {
        return tempPizza.getDescription() + ",Tomato Sauce";
    }
    public double getCost() {
        return tempPizza.getCost() + .25;
    }
}
