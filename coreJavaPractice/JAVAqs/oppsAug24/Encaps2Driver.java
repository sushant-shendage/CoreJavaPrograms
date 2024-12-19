public class Encaps2Driver {
    public static void main(String[] args) {
        Encaps2 ob1=new Encaps2(2,3);
        System.out.println(ob1.getA());
        
        ob1.setA(22);
        System.out.println(ob1.getA());

        ob1.setA(222);
        System.out.println(ob1.getA());
    }
}
