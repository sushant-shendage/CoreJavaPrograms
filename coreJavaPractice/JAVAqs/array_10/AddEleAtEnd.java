import java.util.Arrays;

public class AddEleAtEnd 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5};
        int lastEle=66;
        int[]temp=new int[a.length+1];


        System.out.println("original a :"+Arrays.toString(a));
        for (int i = 0; i < temp.length; i++) 
        {
            if (i<a.length) 
            {
                temp[i]=a[i];
            } else {
                temp[i]=lastEle;
            }
        }
        System.out.println("Array temp :"+Arrays.toString(temp));
    }
    
}
