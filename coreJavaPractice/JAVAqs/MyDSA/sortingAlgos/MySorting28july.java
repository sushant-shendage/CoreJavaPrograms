import java.util.Arrays;

public class MySorting28july {
    public static void main(String[] args) {
        int a[] = { -3, -3, -3, -3, -1, -1, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 6 };
        System.out.println("STEP0 :"+"a : "+Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                a[i] -= 1;
            }
        }
        System.out.println("STEP1 : AV1"+Arrays.toString(a));

        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        int MIN = min, MAX = max;
        if (max < 0) {
            max *= -1;
        }
        if (min < 0) {
            MIN *= -1;
        }
        System.out.printf("STEP2&3 :"+"max : %d     min :%d    MAX : %d     MIN :%d \n", max, min,MIN,MAX);
         

        int a2[] = new int[MAX + MIN];
        for (int i = 0; i < a2.length; i++) 
        {
            if (min == 0) 
            {
                min = 1;
                a2[i] = min;
                min++;
                continue;
            }
            a2[i] = min;
            min++;
        }

        System.out.println("STEP4 :"+"a2 : "+Arrays.toString(a2));






        int a3[] = new int[MAX + MIN];
       // System.out.println("STEP5 :"+"a3 : "+Arrays.toString(a3));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a[i]==a2[j])
                {
a3[j]+=a[i];
                }
            }
        }
        System.out.println("STEP5 :"+"a3 : "+Arrays.toString(a3));

        int a4[] = a3;
        System.out.println("STEP5 :"+"a4 : "+Arrays.toString(a4));
         
    }
     
}