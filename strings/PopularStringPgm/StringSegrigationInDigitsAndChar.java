// package PopularStringPgm;

public class StringSegrigationInDigitsAndChar {
    public static void main(String[] args) {
        String inputString="ge76thg7";
        String outputString="";

        for (int i = 0; i < inputString.length(); i++) {
            // if (inputString.charAt(i)>='0'+0 && inputString.charAt(i)<='9'+0) {
            //     outputString+=inputString.charAt(i);
            // } else {
            //     outputString=inputString.charAt(i)+outputString;
            // }

            outputString=(inputString.charAt(i)>='0' && inputString.charAt(i)<='9')?(outputString+inputString.charAt(i)) : (inputString.charAt(i)+outputString);
        }
        
        System.out.printf("output String ::%s",outputString);
    }
    
}
