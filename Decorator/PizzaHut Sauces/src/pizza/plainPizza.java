package pizza;

public class plainPizza implements Pizza{
    public plainPizza() {
        System.out.println("Adding Dough");
    }
    @Override
    public String getDescription() {
        return "Thin Dough";
    }
    @Override
    public double getCost() {
        return 4.00;
    }
}
