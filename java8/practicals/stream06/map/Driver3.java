import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {
    public static void main(String[] args) {
        List<Employee> empInfo = new ArrayList();
        empInfo.add(new Employee(1, "emp1", 30000));
        empInfo.add(new Employee(1, "emp2", 34000));
        empInfo.add(new Employee(1, "emp3", 50000));
        empInfo.add(new Employee(1, "emp4", 60000));

        List<Employee> ansEmpInfo = empInfo.stream().filter(n -> n.salary >= 50000).map(n -> {
            n.salary *= 1.20;
            return n;
        }).collect(Collectors.toList());

        ansEmpInfo.forEach(System.out::println);
        System.out.println("---------------------------------------");

        empInfo.stream().filter(n -> n.salary >= 50000).map(n -> {
            n.salary *= 1.20;

            return n;
        }).forEach(System.out::println);

        
    }
}

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}