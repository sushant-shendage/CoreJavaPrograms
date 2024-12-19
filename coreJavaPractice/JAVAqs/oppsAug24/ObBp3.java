public class ObBp3 {
    int a,b,c,d,x,y,z,p,q,r,s;

    ObBp3(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    ObBp3(int a,int b,int c,int d,int x,int y,int z)
    {
        this(a, b, c,d);
        this.x=x;
        this.y=y;
        this.z=z;

    }
    ObBp3(int a,int b,int c,int d,int x,int y,int z,int p,int q,int r,int s)
    {
        this(a, b, c,d,x,y,z);
        this.p=p;
        this.q=q;
        this.r=r;
        this.s=s;
    }

    void displayObBp2Attributes()
    {
        System.out.println("att1 :"+a);
        System.out.println("attb :"+b);
        System.out.println("attc :"+c);
        System.out.println("attd :"+d);
        System.out.println("attx :"+x);
        System.out.println("atty :"+y);
        System.out.println("attz :"+z);
        System.out.println("attp :"+p);
        System.out.println("attq :"+q);
        System.out.println("attr :"+r);
        System.out.println("atts :"+s);

    }
    
}
