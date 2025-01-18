// package javapgms.optionalclass;

public class Driver1 {
    public static void main(String[] args) {
        String inputString=null;
        System.out.println(inputString);

        if (inputString!=null) {
            System.out.println("length :"+inputString.length());
        } else {
            System.out.println("null string..!");
        }
    }
}
