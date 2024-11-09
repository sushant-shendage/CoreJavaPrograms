// package javapgms.oops.methodChaining;

public class Driver1 {
   public static void main(String[] args) {
    Obj1 ob1=new Obj1();

    ob1.nonStaticMethod1().nonStaticMethod2().nonStaticMethod3().staticMethod().nonStaticMethod3().staticMethod();
   }
    
}

class Obj1
{

    Obj1 nonStaticMethod1(){
    System.out.println("non static Method 1 code..!");
    return this;
}
Obj1 nonStaticMethod2(){
    System.out.println("non static Method 2 code..!");
    return this;

}
Obj1 nonStaticMethod3(){
    System.out.println("non static Method 3 code..!");
    return this;

}
Obj1 staticMethod(){
    System.out.println("static Method 1 code..!");
    return this;
}

}