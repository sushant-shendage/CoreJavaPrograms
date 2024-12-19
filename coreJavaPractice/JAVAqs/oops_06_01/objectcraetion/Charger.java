public class Charger {
    //blueprint of charger=object1
int watt;
String cable_type;
String brand;

Charger(int watt,String cable_type,String brand)
{
 this.watt=watt;
 this.cable_type= cable_type;
 this.brand= brand;

}

void displayCharger(){
    System.out.println("color:"+(this.watt));
    System.out.println("size:"+(this.cable_type));
    System.out.println("brand:"+(this.brand));
}
 

}
