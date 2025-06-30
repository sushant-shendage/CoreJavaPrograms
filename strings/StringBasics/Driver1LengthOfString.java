// package StringBasics;

public class Driver1LengthOfString {
    public static void main(String[] args) {
        String str = "aswellas";

        // length of string using inbuilt method
        System.out.println("length of string " + str + " is " + str.length());

        // length of string without using inbuilt method
        System.out.println("length of string " + str + " is " + stringLength(str));
    }

    public static int stringLength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        }  catch(Exception e){
return i;
        }
        
    }
}
