
import java.util.Arrays;

public class AdjecentSortV1_7thjuly24 {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        for (int i = 0; i < 5; i++) {
            a = adjecentSortV1c1(a);
            //a = adjecentSortV1c2(a);
        }

    }

    static int[] adjecentSortV1c1(int[] arr) 
    {
        for (int i = 0,j=0; i < arr.length - 1||j<arr.length; i += 2) 
        {
            if (i % 2 == 0) 
            {
                if (arr[i] > arr[i + 1]) 
                {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
            } else 
            {
                j=i;
                
                if (arr[j] > arr[j + 1]) 
                {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }


            }

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

     
}
