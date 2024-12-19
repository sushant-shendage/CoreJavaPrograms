import java.util.Arrays;

public class ZigzagArrayElestoring {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 11, 22, 33, 44,55,66,77,88,99};

        int[] c = new int[a.length + b.length];

        int i, j;

        if (a.length > b.length) 
        {
            for (i = 0, j = 0; i < c.length; i += 2, j++) 
            {
                if (i < 2 * b.length) 
                {
                    c[i] = a[j];
                    c[i + 1] = b[j];
                } else {
                    c[i] = a[j];
                    i--;
                }

            }
        }
        else if(b.length > a.length)
        {
            for (i = 0, j = 0; i < c.length; i += 2, j++) 
            {
                if (i < 2 * a.length) 
                {
                    c[i] = a[j];
                    c[i + 1] = b[j];
                } else {
                    c[i] = b[j];
                    i--;
                }

            }

        } 
        else
        {
            for (i = 0, j = 0; i < c.length; i += 2, j++) 
            {
                 
                    c[i] = a[j];
                    c[i + 1] = b[j];
                 

            }
        }
        
        System.out.println(Arrays.toString(c));
    }
}
//last version