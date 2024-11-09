// package javapgms.oops.constructor.constructorChaining;

public class Obj1BluepPrint {
    Obj1BluepPrint(int a) {
        this();
        System.out.print(" CODE:B");
    }
    Obj1BluepPrint(int a,double b) {
        this(a);
        System.out.print(" CODE:C");
    }
    Obj1BluepPrint() {
       
        System.out.print("     CODE:A");
    }
    public static void main(String[] args) {
        Obj1BluepPrint ob1=new Obj1BluepPrint();
        Obj1BluepPrint ob2=new Obj1BluepPrint(5);
        Obj1BluepPrint ob3=new Obj1BluepPrint(5,5.7);

    }
}
