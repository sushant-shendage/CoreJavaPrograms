import java.util.ArrayList;
import java.util.List;

public class Driver4 {
    public static void main(String[] args) {
        List<Employee> employeeInfo = new ArrayList<Employee>();
        employeeInfo.add(new Employee(723, "a-emp", 45000));
        employeeInfo.add(new Employee(923, "b-emp", 35000));
        employeeInfo.add(new Employee(323, "c-emp", 8000));
        employeeInfo.add(new Employee(823, "d-emp", 56000));
        employeeInfo.add(new Employee(223, "e-emp", 10000));

        employeeInfo.stream().filter(n -> n.salary >= 15000).forEach(e -> System.out.println(e));
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
