// package java8.lambdaexpression;

public class AssigningLamdaToFunctionalInterface01 {

    public static void main(String[] args) {
        DemoFunctionalInterface functionalInterfaceVar=()->{
            return 22d/7;
        };

        System.out.println("Value of pi :"+functionalInterfaceVar.pi());
    }
}

@FunctionalInterface
interface DemoFunctionalInterface{
    double pi();
}