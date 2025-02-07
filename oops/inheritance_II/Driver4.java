//program to check base class private member,initilizers(both static and non-static)and consructor is inherited by derived class or not
public class Driver4 {
    public static void main(String[] args) {
        Derived1 d1=new Derived1(5);

//gives compile time error
    //System.out.println("printing private static variable:"+d1.intVar1);

    System.out.println("printing non-private static variable:"+d1.intVar2);


    }
}

class Base1 {
    static private int intVar = 46;
    static int intVar2;

    Base1(int intVar2) {
        this.intVar2 = intVar2;
    }

    {
        System.out.println("non-static initilizer..!");
    }

    static {
        System.out.println("static initilizer..!");
    }


}

class Derived1 extends Base1{
Derived1(){
super(i);
}


}