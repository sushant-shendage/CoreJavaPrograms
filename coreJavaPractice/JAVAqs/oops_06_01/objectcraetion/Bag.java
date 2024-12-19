
public class Bag {
    String color;
    int size;
    String brand;
    double price;

Bag(String color,int size,String brand,double price){
    System.out.println("Statrup instruction for Bag object");
    this.color=color;
   this.size= size;
    this.brand=brand;
    this.price=price;
}
    
void displayBag(){
    System.out.println("color:"+(this.color));
    System.out.println("size:"+(this.size));
    System.out.println("brand:"+(this.brand));
    System.out.println("price:"+(this.price));
}
 
}
