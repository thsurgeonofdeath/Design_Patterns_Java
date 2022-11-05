import boissons.Boisson;
import boissons.Espresso;
import boissons.Iced;
import decorators.Chocolate;
import decorators.Vanilla;

public class Test {
    public static void main(String[] args) {
        Boisson drink = new Espresso();
        System.out.println("*************************");
        System.out.println(drink.getDescription());
        System.out.println("price is : "+drink.cout());
        System.out.println("*************************");
        drink = new Chocolate(drink);
        System.out.println(drink.getDescription());
        System.out.println("price is : "+drink.cout());
        System.out.println("*************************");
        Boisson coffee = new Iced();
        coffee = new Vanilla(coffee);
        System.out.println(coffee.getDescription());
        System.out.println("price is : "+coffee.cout());
        System.out.println("*************************");
    }
}