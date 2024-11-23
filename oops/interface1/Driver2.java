public class Driver2 {

    public static void main(String[] args) {
        Level1Node1 ob1=new Imp1();
        ob1.method1();

        Level1Node1 ob2=new Imp2();
        ob2.method1();
        
    }
}

interface Level1Node1{
    public void method1();
}

class Imp1 implements Level1Node1{
    @Override
    public void method1(){
        System.out.println("Level 1 node 1  imp1 ");
    }
}
class Imp2 implements Level1Node1{
    @Override
    public void method1(){
        System.out.println("Level 1 node 1  imp2 ");
    }
}
