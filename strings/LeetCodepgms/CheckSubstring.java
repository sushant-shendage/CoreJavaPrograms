public class CheckSubstring{
    
    public static void main(String[] args) {
    System.out.println(Check("leetcode", "le"));

    // System.out.println("mainstring".indexOf("string"));
    }
    static int Check(String mainString,String subString){
     System.out.println(mainString.indexOf(subString));

        if ((mainString.indexOf(subString))>=0) {
            return 1;
        }else{
            return -1;
        }
    }
}