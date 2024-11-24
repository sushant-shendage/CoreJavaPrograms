// package javapgms.inharitance;

public class Driver1 {
    public static void main(String[] args) {
        Parent1 object1=new Child1();
        object1.method1();
    }
}

interface Parent1{
      void method1();
}

class Child1 implements Parent1{
@Override
public void method1(){
    System.out.println("child 1 method 1 implementation..!");
}
}