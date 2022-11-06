public class Test {
    public static void main(String[] args) {

        Responsable CEO = new Responsable();
        CEO.salary = 120000;

        Individu employee1 = new Individu();
        Individu employee2 = new Individu();
        Individu employee3 = new Individu();

        CEO.addEmployee(employee1);
        CEO.addEmployee(employee2);
        CEO.addEmployee(employee3);

        employee1.getCout();
        CEO.getCout();
    }
}