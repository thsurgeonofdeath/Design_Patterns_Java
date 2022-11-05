import Toppings.Mozarella;
import Toppings.tomatoSauce;
import pizza.Pizza;
import pizza.plainPizza;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new tomatoSauce(new Mozarella(new plainPizza()));
        System.out.println("**********************");
        System.out.println("Ingredients : "+pizza.getDescription());
        System.out.println("Total cost : "+pizza.getCost());
        System.out.println("**********************");
    }
}