// package java8.lambdaexpression;

public class AssignLabdaExpressionSingleAbstractMethodClass02 {
    public static void main(String[] args) {
        DemoAbstractClassSingleAbstractMethod ob1=()->{
return 22/7f;
        };


        System.out.println("ob1 : "+ob1.pi());


    }
}
 
interface   DemoAbstractClassSingleAbstractMethod{
    abstract float  pi();
}