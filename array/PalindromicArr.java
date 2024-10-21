// package javapgms.array;

public class PalindromicArr {
    public static void main(String[] args) {
        int arr[]={1,2,1,7};
        for (int i = 0,j=arr.length-1; i < arr.length/2; i++,j--) {
            if (arr[i]!=arr[j]) {
                System.out.println("it is not palindromic arr");
                return;
            }
        }
        System.out.println("it is palindromic arr");


    }
    
}
