import java.util.Arrays;

public class OccurenceOfUniqueEleInArr2july_24 {
    public static void main(String[] args) {
        int[]a={1,2,3,3,2,2,1,2,3,3,2,1,1,1,1,2,3,3,2,1,1,1,1};
        int[]ref=new int[a.length];
        int count,j;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(ref));
        for (int i = 0; i < ref.length; i++) {

            if(ref[i]==-1)
            {
                break;
            }
            else
            {
                count=0;
                for ( j = i+1; j < ref.length; j++) {
    
                    if (a[i]==a[j]) {
                       
                        count++;
                        ref[j]=-1;
                    }
    
                    if (ref[i]!=-1) {
                        ref[i]=count; 
                    }
                   
                    
            }
               
            }

            }
            
           
        System.out.println(Arrays.toString(ref));

        for (int i = 0; i < ref.length; i++) {
            if(ref[i]!=-1){

                System.out.println(a[i]+" repeated in array for "+ref[i]+" times");

            }
        }
    }
    
}
