
public class ArrayCopyToOther {
    public static void main(String[] args) {
        int arr1[]={77,9,67,48,57,94,21,7,22,20};

        int[] arr2=new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
        arr2[i]=arr1[arr1.length-1-i];   
        }

        
        for (int j= 0; j < arr1.length; j++) {
            System.out.print(arr2[j]+"  ");  
            }
    }
    
}
