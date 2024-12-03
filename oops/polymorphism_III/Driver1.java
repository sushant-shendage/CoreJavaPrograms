// package javapgms.oops.polymorphism_III;

public class Driver1 {
    public static void main(String[] args) {
        Areacalculator.area(1);
        Areacalculator.area(2.3,4.5);
        PerimeterCalculator.permimeter(2);
        PerimeterCalculator.permimeter(2,3);
        PerimeterCalculator.permimeter(2,3,4);


    }
    
}

class Areacalculator{
    static void area(double radius){
        System.out.println("\nArea of circle with radius "+radius+" :"+3.14*radius*radius);
    }
    static void area(double length,double breadth){
        System.out.println("\nArea of rectangle with length and breadth ("+length+","+breadth+") :"+length*breadth);

    }
}

class PerimeterCalculator{
    static void permimeter(double side){
        System.out.println("perimerter of square with side"+side+" is "+4*side);
    }
    static void permimeter(double side1,double side2){
        System.out.println("perimerter of rectangle with length"+side1+"and breadth"+side2+" is "+side1*side2);
    }

    static void permimeter(double side1,double side2,double side3){
        System.out.println("perimerter of triangle with sides"+side1+","+side2+" &"+side3+"is "+side1+side2+side3);
    }
}
