public class Driver3 {
    public static void main(String[] args) {
        new Pc1().mp1();
        new Pc2().mp1();
        new Pc3().mp1();
        new Pc4().mp1();

    }
}

class P1{
    static void mp1(){System.out.println("p1");}
}

class Pc1 extends P1{
    static void mp1c1(){System.out.println("p1c1");}
}
class Pc2 extends P1{
    static void mp1c2(){System.out.println("p1c2");}
}
class Pc3 extends P1{
    static void mp1c3(){System.out.println("p1c3");}
}
class Pc4 extends P1{
    static void mp1c4(){System.out.println("p1c4");}
}



