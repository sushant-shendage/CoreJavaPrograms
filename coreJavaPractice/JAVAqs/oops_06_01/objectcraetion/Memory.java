
public class Memory {
 
    String color;
    String brand;
    double price;

Memory(String color,String brand,double price){
    System.out.println("Statrup instruction for Memory object2/10");
    this.color=color;
    this.brand=brand;
    this.price=price;
}
    
void displayMemory(){
    System.out.println("color:"+(this.color));
    System.out.println("brand:"+(this.brand));
    System.out.println("price:"+(this.price));
}
}
