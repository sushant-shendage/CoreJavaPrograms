import java.util.Arrays;

public class AddEleAtNthIndex {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]temp=new int[a.length+1];
        
        int index=2,num=444;

         System.out.println("original Array :"+Arrays.toString(a));

        for (int i = 0; i < temp.length; i++) {
            if (i<index) {
                temp[i]=a[i];
                
            } else if(i==index)
            {
              temp[i]=num;  
            }
            else
            {
                temp[i]=a[i-1];
            }
        }

        System.out.println("answer Array :"+Arrays.toString(temp));
    }
}
