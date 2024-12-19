import java.util.Arrays;

public class A1ToA2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int e[]={1,2,3,4,5,6,7,8,9};
        int b[]=new int[a.length];

        int c[]=new int[a.length+b.length];
        int d[]=new int[a.length+b.length];

        System.out.println(Arrays.toString(b));

        a1ToA2Linear(a,b);
        System.out.println(Arrays.toString(b));

        a1A2ToA3Linear(a,b,c);
        System.out.println(Arrays.toString(c));

        a1A2ToA3Alternate(a,e,d);
        // System.out.println(Arrays.toString(d));

         
    }
    static void a1ToA2Linear(int arr1[],int arr2[])
    {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
    }

    static void a1A2ToA3Linear(int arr1[],int arr2[],int arr3[])
    {
        for (int i = 0,j=0; i < arr3.length; i++) 
        {
            if (i<arr1.length) 
            {
                arr3[i]=arr1[i];
            } else 
            {
                arr3[i]=arr2[j];
                j++;
            }
        }
    }

    static void a1A2ToA3Alternate(int arr1[],int arr2[],int arr3[])
    {
        for (int i = 0,j=0; i < arr3.length; i+=2,j++) 
        {
            arr3[i]=arr1[i];
            arr3[i+1]=arr2[j];
            System.out.println(Arrays.toString(arr3));
        }
    }

}
