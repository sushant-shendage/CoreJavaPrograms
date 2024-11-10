// package javapgms.oops.AbstractClass;

public class Driver1 {
    public static void main(String[] args) {
        // ----------------------------------------------------------
        SoftwareA ob1 = new SoftwareAImp1();
        ob1.feature1();
        ob1.about();

        // ----------------------------------------------------------
        SoftwareAImp1 ob2 = new SoftwareAImp1();
        ob2.about();

        // ----------------------------------------------------------
        SoftwareAImp2 ob3 = new SoftwareAImp2();
        ob3.about();

        // ----------------------------------------------------------
        System.out.println("static variable value printing using object :" + ob3.statiVAriable1);

        // ----------------------------------------------------------
        System.out.println("static variable value printing using class refrence :" + SoftwareA.statiVAriable1);

        

    }
}

abstract class SoftwareA {

    final static int statiVAriable1 = 34;

    //-------------------------------------------------------
    public static void about() {
        System.out.println("All features..!");
    }

    abstract void feature1();
}

class SoftwareAImp1 extends SoftwareA {
    @Override
    public void feature1() {
        System.out.println("feature 1 implimentation 1..!");
    }
}

class SoftwareAImp2 extends SoftwareA {
    @Override
    public void feature1() {
        System.out.println("feature 1 implimentation 2..!");
    }
}