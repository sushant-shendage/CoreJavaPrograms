// package oops_06_02.Constructor_chaining_04;

public class Mc_Obj1 {
    public void displayMsg2() {
        System.out.println("msg2 from non static method");
    }

    public static void displayMsg1() {
        System.out.println("msg1 from static method");
    }

    // chaining methods
    public Mc_Obj1 displayMsg3() {
        System.err.println("----------------------------------------");
        System.out.println("msg3 from non-static method nsmce3");
        return this;
    }
    public  Mc_Obj1 displayMsg32() {
        System.out.println("msg31 from non-static method nsmce32 ");
        return this;
    }

    public static void displayMsg4() {
        System.out.println("msg4 from  static void method nsmce4");
        System.err.println("----------------------------------------");        
    }

}
