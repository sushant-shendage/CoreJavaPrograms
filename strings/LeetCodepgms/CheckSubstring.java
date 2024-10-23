public class CheckSubstring{
    public static void main(String[] args) {
    // System.out.println(Check("leetcode", "leto"));
    }
    static int Check(String mainString,String subString){
        if (mainString.indexOf(subString)>0) {
            return 1;
        }else{
            return -1;
        }
    }
}