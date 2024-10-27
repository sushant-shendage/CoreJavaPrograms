public class ImplicitTypeCastingPrimitivedata {
    public static void main(String[] args) {
       
       //implicit typecasting converting smaller type to larger type
        byte byteVar=99;
        short shortVar=50;
        
        //invalid typecasting
        // byteVar=(short)shortVar;

        /*
         In Java, certain explicit typecasting between primitive data types is invalid. 
         - For instance, you cannot cast boolean to any other primitive type, like int, char, or double. 
          Similarly, char cannot be cast to boolean, and neither can byte, short, int, long, float, or double.

        -Additionally, casting float or double to char is also invalid because they represent different types of values.
        Although int can be cast to char if the integer value is within the valid range (0 to 65535), direct casting is not allowed for integers outside this range. 
        In summary, certain combinations of primitive data types cannot be explicitly cast to each other in Java.
        */

        //integer
        System.out.println(123);
        //num +char ------>  num+char_ascii----->(chat to ascii conversion)
        System.out.println('A'+0);
        


    }
    
}
