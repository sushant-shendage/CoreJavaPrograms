public class DriverMethodShodowing {
    public static void main(String[] args) {
        Parent1 ob1=new Parent1();
        ob1.staticMethod1();


        Child1 ob3=new Child1();
        ob3.staticMethod1();

        

        Parent1 ob2=new Child1();
        ob1.staticMethod1();


    }
}
class Parent1{
    static void staticMethod1(){
System.out.println("static method1 parent1");
    }
}

class Child1 extends Parent1{
    static void staticMethod1(){
System.out.println("static method1 child1");
    }
}