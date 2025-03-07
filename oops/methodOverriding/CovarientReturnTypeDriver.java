// package javapgms.oops.methodOverriding;

public class CovarientReturnTypeDriver{
    
}

class Parent1{
    void nonStaticMethod(){
    System.out.println("non-static method of parent class with void datatype");
    }
}

class Child1 extends Parent1{
    String nonStaticMethod(){
return "child class overided method with return type string";
    }
}