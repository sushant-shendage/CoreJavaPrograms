// package javapgms.oops.constructor.constructorChaining;

 class Obj2 {
    Obj2(){
        System.out.println("Default constructor of parent OBJ2..!");
    }

}
 class Obj2c1 extends Obj2 {
    Obj2c1(){
        super();
        System.out.println("Default constructor of parent OBJ2c1..!");
    }   
}

public class Driver{
    public static void main(String[] args) {
        Obj2 ob1=new Obj2();
        Obj2c1 ob2=new Obj2c1();
    }
}
