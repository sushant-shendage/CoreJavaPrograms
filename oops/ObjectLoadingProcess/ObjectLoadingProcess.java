package javapgms.oops.ObjectLoadingProcess;
// package oops;

public class ObjectLoadingProcess {

    int nonStaticIntVar1=55;
    int nonStaticIntVar2;

    {
        System.out.println("non-static block 1");
    }
    {
        System.out.println("non-static block 2");
    }
    {
        System.out.println("non-static block 3");
    }

    ObjectLoadingProcess(){
        System.out.println("constructor first statement");
        System.out.println("constructor attribute releted statements");
        System.out.println("constructor last  statement");
    }
    public static void main(String[] args) {
        ObjectLoadingProcess ob1=new ObjectLoadingProcess();
        System.out.println(ob1.nonStaticIntVar2);
    }
}
