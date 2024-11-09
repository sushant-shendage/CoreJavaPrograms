public class FibSeriesElement {
    public static void main(String[] args) {
        int number1=0,number2=1,limit=8,sum=0;

        for(int i=0;i<limit;i++){
            System.out.println("fib "+(i+1)+" :"+number1);
            sum     = number1+number2;
            number2 = number1        ;
            number1 = sum            ;
        }
    }
}
