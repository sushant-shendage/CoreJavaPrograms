// package javapgms.oops.constructor.constructorOverloading;

public class Obj1Blueprint {
    //Default constructor
    Obj1Blueprint() {
        System.out.println("DEFAULT constructor");
    }
 
    //constructor with single integer argument
    Obj1Blueprint(int a) {
        System.out.println("constructor with 1 argument (int)");
    }

    //constructor with two double argument
    Obj1Blueprint(double a, double b) {
        System.out.println("constructor with 2 argument (double,double)");
    }

    //constructor with two  argument one in integer and other is float
     Obj1Blueprint(int a, float b) {
        System.out.println("constructor with 2 argument (int,float)");
    }
    public static void main(String[] args) {
        Obj1Blueprint ob1=new Obj1Blueprint();
        Obj1Blueprint ob2=new Obj1Blueprint(2);
        Obj1Blueprint ob3=new Obj1Blueprint(2.3,5.7);
        Obj1Blueprint ob4=new Obj1Blueprint(2,3.7f);   
    }


}
