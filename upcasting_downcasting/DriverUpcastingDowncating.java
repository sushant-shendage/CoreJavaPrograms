public class DriverUpcastingDowncating {
    public static void main(String[] args) {
        // upcasting
        Parent1 ob = new Child1();

        System.out.println(ob.i);
        System.out.println(ob.j);
        // System.out.println(ob.k);
        // System.out.println(ob.l);

        System.out.println("-----------------------------------------------------");
        // downcasting
        Child1 ob2 = (Child1) ob;

        System.out.println(ob2.i);
        System.out.println(ob2.j);
        System.out.println(ob2.k);
        System.out.println(ob2.l);

    }
}

class Parent1 {
    int i = 33;
    int j = 44;
}

class Child1 extends Parent1 {
    int k = 55;
    int l = 66;
}