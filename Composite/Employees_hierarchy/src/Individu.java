public class Individu extends Employee{
    public Individu() {
        super();
        this.salary = 1500;
    }
    @Override
    public void getCout() {
        System.out.println("Le Coût est :"+ this.salary);
    }
}
