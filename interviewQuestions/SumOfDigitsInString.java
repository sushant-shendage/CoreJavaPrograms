// package javapgms.interviewQuestions;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String inputString="56hio45uh6i5";
        int sum=0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i)+0>=48 && inputString.charAt(i)+0<=57) {
                 sum+=(inputString.charAt(i)-48);
            }
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                 sum+=(inputString.charAt(i)-48);
            }
        }

        System.out.println(sum);
    }
    
}
