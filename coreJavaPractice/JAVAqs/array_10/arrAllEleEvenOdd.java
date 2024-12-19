import java.util.Arrays;

public class arrAllEleEvenOdd {
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7};

        System.out.println("original Array :"+Arrays.toString(a));
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i]%2!=0)
            {
                a[i]+=1;
            }
        }
        System.out.println("Modified Array :"+Arrays.toString(a));
    }
    
}
