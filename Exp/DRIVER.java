// package javapgms.Exp;

public class DRIVER{
    public static void main(String[] args) {
        // overiding method in functional interface using lambda expression
        checkNumberEvenOdd var1 = (a)-> {
            return (a % 2 == 0) ? true : false;
        };
        System.out.println(var1.checkNum(7));
        // -------------------------------------------------------------------------------------
        // no compulsion to use parenthesis when there is single formal argument
        // no compulsion to use curly braces when there is single statement
        // implicit return type
        checkNumberEvenOdd var2 = a -> (a % 2 == 0) ? true : false;
        System.out.println(var2.checkNum(6));
    }
}
interface checkNumberEvenOdd {
    boolean checkNum(int n);
}

