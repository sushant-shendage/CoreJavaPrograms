
public class ArrayPositiveNegative {
    public static void main(String[] args) {
        int[] arr1={77,9,-67,48,-57,94,-21,7,22,-20};

        for (int i = 0; i < arr1.length; i++) {
             if (arr1[i]>=0) {
                System.out.println("positive :"+arr1[i]); 
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<0) {
               System.out.println("negative :"+arr1[i]); 
           }
       }
    }
    
}
