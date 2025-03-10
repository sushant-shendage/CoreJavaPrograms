public class NumberCombinationIsPrime {
   public static void main(String[] args) {
   System.out.println(combination(111));
   } 

  static  int combination(int num){
    boolean isCombinationPrime=false;
    int count=0;
    for (int i = num; i!=0; i/=10) {
        count++;
    }

    for (int j = 1; j<=count ; j++) {
        int lastDigit=num%10;
        num/=10;
        num=num*10+lastDigit;

        int k=0;
        for (  k = 2; k < num ; k++) {
            if(num%k==0){
                break;
            }
        }

        if(k==num){
            isCombinationPrime=true;
        }
        if (isCombinationPrime) {
            return num;
        }
        
    }
    return 0;

   }
}
