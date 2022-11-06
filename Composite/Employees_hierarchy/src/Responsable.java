import java.util.ArrayList;

public class Responsable extends Employee{
    ArrayList<Employee> employees = new ArrayList<>();
    public Responsable() {
        super();
    }
    @Override
    public void getCout() {
        for (Employee e:employees){
            this.salary += e.salary;
        }
        System.out.println("le Coût est : "+this.salary);
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
