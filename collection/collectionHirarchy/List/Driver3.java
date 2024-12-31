import java.util.ArrayList;
import java.util.List;

public class Driver3 {
    public static void main(String[] args) {
        List <Laptop> deviceInfo= new ArrayList();

        deviceInfo.add(new Laptop("l011", "a-device", 34567));
        deviceInfo.add(new Laptop("l061", "b-device", 45687));
        deviceInfo.add(new Laptop("l078", "c-device", 50000));
        deviceInfo.add(new Laptop("l567", "d-device", 23455));

        deviceInfo.forEach(System.out::println);

    }
    
}
class Laptop{
    String id;
    String name;
    double price;
    public Laptop(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    
}
