// package javapgms.oops.Abstraction_IV;

public class Driver1 {
    public static void main(String[] args) {
        
    }
}

abstract class Print{
public   abstract void printThis();
}

class Imp1 extends Print{
    @Override
    public void printThis(){
System.out.println("print this");
    }
}
