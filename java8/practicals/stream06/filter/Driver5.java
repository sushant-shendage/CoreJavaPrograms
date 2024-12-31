import java.util.ArrayList;
import java.util.List;

public class Driver5 {
    public static void main(String[] args) {
        List<StudentDetails> list1 = new ArrayList<>();
        list1.add(new StudentDetails(34, "a-name", "banglore"));
        list1.add(new StudentDetails(45, "b-name", "X-address"));
        list1.add(new StudentDetails(67, "c-name", "banglore"));
        list1.add(new StudentDetails(90, "d-name", "E-address"));
        list1.add(new StudentDetails(21, "e-name", "w-address"));
        
        list1.stream().filter(n -> n.address.equals("banglore")).forEach(e -> System.out.println(e));
    }
}

class StudentDetails {
    int id;
    String name;
    String address;

    public StudentDetails(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDetails [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}