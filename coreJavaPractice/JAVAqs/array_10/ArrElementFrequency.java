import java.util.Arrays;

public class ArrElementFrequency {
    public static void main(String[] args) {

        int arr[]={1,2,1, 1, 3,4,5,2,3,1,3,2,2,4,5 ,8};
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // int i = 0;

        // while (i < arr.length) {
        //     int count = 1;

        //     while (i + 1 < arr.length && arr[i] == arr[i + 1] ) {
        //         count++;
        //         i++;
        //     }

        //     System.out.println(arr[i] + " - " + count);

        //     i++;
        // }


        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            } 
        }

        // System.out.println(max + " and " + max2);




        String s = "noice";

        s = s.toUpperCase().charAt(0);

        System.out.println(s);


    }


   

}
