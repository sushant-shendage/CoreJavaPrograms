public class MainNumberPrograms {
    public static void main(String[] args) {

         
            // generateRandomNumber();
            // generateNDigitRandomNumber(4);

            // isPrime(i);
            // nextPrime(i);

           // fibonasciiSeries(7);
        //    isFibonasciiElement(7);

        factorialUsingLoop(4);
        factorialUsingRecursion();


         
    }

    public static void generateRandomNumber() {
        System.out.println("random number : " + Math.random());
        System.out.println("-------------------------------------------|");

    }

    public static void generateNDigitRandomNumber(int totalDigits) {
        /*
         * n digit number =R= randomNumber*10^n (where R<= 10^(n-1) as well as
         * R<=10^(n)-1 )
         */
        if (totalDigits == 0) {
            System.out.println(totalDigits + " digit random number : " + Math.random());
            System.out.println("-------------------------------------------|");
            return;
        }
        long l;

        while (true) {
            l = (long) (Math.random() * Math.pow(10, totalDigits));

            if (l >= Math.pow(10, totalDigits - 1) && l <= (Math.pow(10, totalDigits) - 1)) {
                break;
            }

        }

        System.out.println(totalDigits + " digit random number : " + l);
        System.out.println("-------------------------------------------|");

    }

    public static void isPrime(long num) {
        long i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i == num) {
            System.out.println(num + " is prime number");
            System.out.println("-------------------------------------------|");

        } else {
            System.out.println(num + " is NOT prime number");
            System.out.println("-------------------------------------------|");
        }
    }

    public static void nextPrime(long num) {
        long num2 = num;

        while (true) {
            num2 += 1;
            long i;
            for (i = 2; i < num2; i++) {
                if (num2 % i == 0) {
                    break;
                }
            }
            if (num2 == i) {
                System.out.println("next prime number after " + num + " is : " + num2);
                return;
            }
        }

    }

    public static void fibonasciiSeries(int limit){

        int first=0,second=1,sum;
        for (int i = 1; i <=limit; i++) {
            System.out.print(first+"|");
            sum=first+second;
            first=second;
            second=sum;

        }
    }

    public static void isFibonasciiElement(int num){
int first=0,second=1,sum;
        for (;first<num ; ) {
            sum=first+second;
            first=second;
            second=sum;
        }
        if (first==num) {
            System.out.println(num+" is fibonascii element");
        }else{
            System.out.println(num+" is not fibonascii element");

        }
    }

    public static void factorialUsingLoop(int num){
int prod=1;
        if (num==0) {
            System.out.println(num+"! = "+prod);
            return;
        }
        for (int i = 1; i <= num; i++) {
            prod*=i;
        }
        System.out.println(num+"! = "+prod);
    }

        
    public static int factorialUsingRecursion(int num){
int prod=1;
        if (num==1 || num==0) {
                        return prod;
        }else{

        }
    }
}
