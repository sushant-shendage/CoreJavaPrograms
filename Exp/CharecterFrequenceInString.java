import java.util.Arrays;

public class CharecterFrequenceInString {
    public static void main(String[] args) {
          String str="aaaaabbbbcccdde";

        char arr[]=str.toCharArray();
        Arrays.sort(arr);
          char target,pc,cc;
          byte count=0;
 
        for (int j = 0; j < arr.length; j++) {
             target=arr[j];
             if (j==0) {
                pc=arr[j];
             }else{
                pc=arr[j-1];
             }

             cc=arr[j];
             if (pc==cc && j!=0) {
                continue;
             }  
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==target) {
                    count++;
                }
            }
            System.out.printf("%c  char occerence in %s strig : %d\n",target,str,count);
            count=0;
        }
    }
}
