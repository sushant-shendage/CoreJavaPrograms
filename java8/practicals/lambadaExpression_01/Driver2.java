public class Driver2 {
    public static void main(String[] args) {
        // overiding method in functional interface usinf=g lambda expression
        checkNumberEvenOdd var1 = (a) -> {
            return (a % 2 == 0) ? true : false;
        };
        System.out.println(var1.checkNum(7));
        // --------------------------------------------------------------------------------------
        // no compulsion to use parenthesis when there is single formal argument
        // no compulsion to use curly braces when there is single statement
        // implesit return type
        checkNumberEvenOdd var2 = a -> (a % 2 == 0) ? true : false;
        System.out.println(var2.checkNum(6));
    }
}
@FunctionalInterface
interface checkNumberEvenOdd {
    boolean checkNum(int n);
}