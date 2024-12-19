import java.util.Arrays;

public class Otp5Digit {
    public static void main(String[] args) {
        generate4DigitOTP();
        generate5DigitOTP();
        generateAlphanumericIDLen(2);
         
    }

    static void generate5DigitOTP() {
        System.out.println("OTP :: " + (int) (Math.random() * 100000));
    }
    static void generate4DigitOTP() {
        System.out.println("OTP :: " + (int) (Math.random() * 10000));
    }
    static void generateAlphanumericIDLen(int length)
    {
        int arr[]=new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
           char chArr[]=new char[length];
           for (int i = 0; i < arr.length; i++) {
            chArr[i]=(char)arr[i] ;
        } 
        System.out.println(chArr);
    }
}
