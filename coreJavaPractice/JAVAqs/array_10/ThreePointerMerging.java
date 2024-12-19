import java.util.Arrays;

public class ThreePointerMerging {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6,7,8,9,10,11};
        int c[]={4,5,6,7,8,9,10,11};
        

        int d[]=new int[a.length+b.length+c.length];

        for (int i = 0,j=0,k=0,l=0;l<d.length;l++) {
            if (i<a.length && j<b.length && ) {
                 if (a[i]<b[j]) {
                    c[k]=a[i];
                    i++;
                 }
                 else if (b[j]<a[i]) {
                    c[k]=b[j];
                    j++;
                 }
                 
            }
            else{
                if (i==a.length) {
                    c[k]=b[j];
                    j++;
                    
                }
                else if (j==b.length){
                    c[k]=a[i];
                    i++;
                  
                }
                
            }
            
        }

        System.out.println(Arrays.toString(c));
    }
    
}
