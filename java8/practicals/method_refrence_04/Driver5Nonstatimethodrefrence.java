public class Driver5Nonstatimethodrefrence{
   
        public static void main(String[] args) {
            Driver5Nonstatimethodrefrence ob1=new Driver5Nonstatimethodrefrence();
          
        User u1=new Driver5Nonstatimethodrefrence()::otpMsg;
         
    u1.generateandsendOtp();
        }
         void  otpMsg(){
            System.out.println("  OTP sent to registered mobile number..!");
        }
    }   
    
    @FunctionalInterface
    interface User{
        void generateandsendOtp();
    }