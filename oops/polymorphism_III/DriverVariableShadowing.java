public class DriverVariableShadowing {
    public static void main(String[] args) {
        Parent1 ob=new Parent1();
        System.out.println(ob.str);

        Child1 ob2= new Child1();
        System.out.println(ob2.str);

        Parent1 ob3= new Child1();
        System.out.println(ob3.str);

    }
}
class Parent1 {
    static String str="StringVar of parent";
} 
class Child1 extends Parent1{
    static String str="StringVar of child";
}
