// package javapgms.customUtility.java;

public class Driver1 {
public static void main(String[] args) {
    System.out.println(CustomUtility.getDataType(678));
    System.out.println(CustomUtility.getDataType(CustomUtility.getIntegerValue("678")));
    System.out.println(CustomUtility.getNDigitIntegerRandomNumber(5));

}    
}
class CustomUtility{
    static String getDataType(Object literalValue){
return ((Object)(literalValue)).getClass().getSimpleName();
    }

    static int getIntegerValue(String stringLiteral){
return Integer.parseInt(stringLiteral);
    }

    static int getNDigitIntegerRandomNumber(int totalDigits){
        return  (int)(Math.random()*Math.pow(10,totalDigits));
    }
}

