// package javapgms.oops.earlyVsLazyBinding.example1;

public class Driver1 {
   public static void main(String[] args) {
    Parent1 ob1=new Parent1c1();//upcasting

    ob1.staticMethod();//early binding(compile time bindind)
    ob1.nonstaticMethod();//lazy binding(run time biding)
   }
}
class Parent1{
    static void staticMethod(){
        System.out.println("this is static method of parent..!");
    }
     void nonstaticMethod(){
        System.out.println("this is onn-static method of parent..!");
    }
}
class Parent1c1 extends Parent1{
    static void staticMethod(){
        System.out.println("this is static method of child1..!");
    }
    void nonstaticMethod(){
        System.out.println("this is non-static method of child1..!");
    }
}