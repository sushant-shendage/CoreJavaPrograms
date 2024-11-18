// package javapgms.interviewQuestions;

import java.util.Arrays;

public class CharsAndDigitSegrigationInString {
    public static void main(String[] args) {
        String inpuString="d7g9&8*hr)(*U&7yht8";

        String s1="";
        String s2="";
        String s3="";

        for (int i = 0; i < inpuString.length(); i++) {
            if ( inpuString.charAt(i)>='0' && inpuString.charAt(i)<='9') {
                s1+=inpuString.charAt(i);
            }else if ((inpuString.charAt(i)>='a' && inpuString.charAt(i)<='z') ||(inpuString.charAt(i)>='A' && inpuString.charAt(i)<='Z')){
                s2+=inpuString.charAt(i);
            }
            else{
                s3+=inpuString.charAt(i);
            }
        }

        System.out.println(s1+s2+s3);
        

 
    }
    
}
