public class ReverseString {
    public static void main(String[] args) {
        String inpuString="aswellas";
        String ansString="";

        for (int i = 0; i < inpuString.length(); i++) {
            ansString=inpuString.charAt(i)+ansString;
        }

        System.out.println(ansString);
    }
}
