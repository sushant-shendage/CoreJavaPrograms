
public class Product {
    String name;
    double price;

Product(String name,double price){
    System.out.println("Statrup instruction for Product object");
    this.name=name;
    this.price=price;
}
    
void displayProduct(){
    System.out.println("name:"+(this.name));
    System.out.println("price:"+(this.price));
}
 
}
