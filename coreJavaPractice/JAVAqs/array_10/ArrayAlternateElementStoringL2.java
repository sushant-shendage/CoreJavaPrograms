import java.util.Arrays;

public class ArrayAlternateElementStoringL2 {
    public static void main(String[] args) 
    {

        int[] a={11,22,33,44,55,66,77};
        int[] b={1,2,3,4,5,6,7};

        int[] c=new int[a.length+b.length];

        for (int i = 0,j=0; i < c.length; i+=2,j++) 
        {
             c[i]=a[j];   
        }
        
        for (int i = 0,j=0; i < c.length; i+=2,j++) 
        {
             c[i+1]=b[j];   
        }
        

        System.out.println(Arrays.toString(c));
    }
    //level1
}
