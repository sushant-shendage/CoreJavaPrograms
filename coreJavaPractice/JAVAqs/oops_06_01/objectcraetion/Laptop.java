
public class Laptop {
 
    String color;
    String brand;
    double price;

Laptop(String color,String brand,double price){
    System.out.println("Statrup instruction for Laptop object2/10");
    this.color=color;
    this.brand=brand;
    this.price=price;
}
    
void displayLaptop(){
    System.out.println("color:"+(this.color));
    System.out.println("brand:"+(this.brand));
    System.out.println("price:"+(this.price));
}
}
