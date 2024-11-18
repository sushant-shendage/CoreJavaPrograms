import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};

        // for(int i = 0 , j = arr.length - 1; i < arr.length / 2; i++ , j--){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     // arr[j] = arr[i];

        // }


        // Left Rotate 
        // int temp = arr[0];
        // for(int i = 0; i < arr.length - 1; i++){
            
        //     arr[i] = arr[i + 1];
           
        // }
        // arr[arr.length - 1] = temp;



        // right rotate 
       for (int j = 1; j <=4; j++) {
        int temp1 = arr[arr.length - 1];
        // int temp2 = arr[arr.length - 2];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; 
        }
        arr[0] = temp1;
       }

        System.out.println(Arrays.toString(arr));
    }
}
