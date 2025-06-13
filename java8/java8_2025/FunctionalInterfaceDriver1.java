// package java8.java8_2025;

public class FunctionalInterfaceDriver1 {
    public static void main(String[] args) {
        BooleanOperations ob1= new BooleanOperationsImp1PositiveNegative();
       
        System.out.println( ob1.check(1));
    }
}

interface BooleanOperations{
boolean check(int num);
}

class BooleanOperationsImp1PositiveNegative implements BooleanOperations{
@Override
public boolean check(int num) {
return num>0;

}
}