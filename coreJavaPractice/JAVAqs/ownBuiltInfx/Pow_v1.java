
public class Pow_v1 {
    public static void main(String[] args) {
      double a=0,b=5,c=2.34;
        for (int i = 1; i <=13; i++) {
            a=Sqrt(b);
            b=a;
        }
 System.out.println(a);
a-=1;
System.out.println(a);
double bf=a*c;
System.out.println(bf);
bf+=1;
// int num=2;
// System.out.println(num);
double prod=1;
for (int i = 1; i <=12; i++) {
   prod*= bf; 
}
System.out.println(prod);
       
         
    }

    static double nextPerfectSquare(double a)
    { 
        for (double i = 1; ; i++) 
        {
            if (i*i==a) 
            {
                return a/i;
            } 
            if (i*i>a) {
                return i;
            }    
        }    
    }

    static double Sqrt(double a)
    {
        double diff=a-nextPerfectSquare(a)*nextPerfectSquare(a);

        if (diff<0) {
            diff*=-1.0;
        }
        // System.out.println(a);
        // System.out.println(nextPerfectSquare(a));
        // System.out.println(diff);
        // System.out.println(nextPerfectSquare(a)-diff/(2.0*nextPerfectSquare(a)));
return nextPerfectSquare(a)-diff/(2.0*nextPerfectSquare(a));
    }

    
}
