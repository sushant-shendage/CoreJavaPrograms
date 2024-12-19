
public class DigitExtraction {
    public static void main(String[] args) {
        int intVar1=1234567890;
          for(int i=intVar1;i!=0;i/=10)
          {
            lastDigit(i);
          }
    }
    static void lastDigit(int i)
    {
       System.out.printf("\nDigits :%d",(i%10));
    }
    
}
