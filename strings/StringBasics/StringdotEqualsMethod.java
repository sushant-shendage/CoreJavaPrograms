public class StringdotEqualsMethod {
    public static void main(String[] args) {
         
String str1=new String("demo");
String str2=new String("demo");
        
        if ( str1.equals(str2)) {
            System.out.println("content compared");
        }

        if (!(str1==str2)) {
            System.out.println("refrence compared");
        }
        
    }
    
}
