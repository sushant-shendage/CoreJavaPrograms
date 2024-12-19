public class Encaps1 {
    private int a, b, c, d;

    public Encaps1(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    int getC() {
        return this.c;
    }

    int getD() {
        return this.d;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void setC(int c) {
        this.c = c;
    }

    void setD(int d) {
        this.d = d;
    }

    void getAll()
    {
        System.out.println("A : "+this.a);
        System.out.println("B : "+this.b);
        System.out.println("C : "+this.c);
        System.out.println("D : "+this.d);

    }

}
