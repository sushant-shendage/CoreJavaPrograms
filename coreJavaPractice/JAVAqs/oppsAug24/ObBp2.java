public class ObBp2 {
    int a=777,b=777,c=777,d=777;

    ObBp2()
    {

    }

    public ObBp2(int a, int b, int c, int d) 
    {
        this.a = a;
        this.b = b;
        
    }
    
    public ObBp2(int a ){
        this.a = a;
    }
    public ObBp2(int a, int b) {
        this.a = a;
        this.b = b;
        
    }
    public ObBp2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    

    void displayObBp2()
    {
        System.out.println("attribute 1 : "+this.a);
        System.out.println("attribute 2 : "+this.b);
        System.out.println("attribute 3 : "+this.c);
        System.out.println("attribute 4 : "+this.d);
        System.out.println("--------------------------");

    }

    ObBp2 att1()
    {
        System.out.println("att1 : "+this.a);
        return this;
    }
    ObBp2 att2()
    {
        System.out.println("att2 : "+this.b);
        return this;
    }
    ObBp2 att3()
    {
        System.out.println("att3 : "+this.c);
        return this;
    }
    ObBp2 att4()
    {
        System.out.println("att4 : "+this.d);
        return this;
    }
}
