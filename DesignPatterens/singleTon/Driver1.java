public class Driver1 {
    public static void main(String[] args) {
        System.out.println(SingleTonClass.SingleTonClassObj());
        System.out.println(SingleTonClass.SingleTonClassObj());
        System.out.println(SingleTonClass.SingleTonClassObj());
        System.out.println(SingleTonClass.SingleTonClassObj());
        System.out.println(SingleTonClass.SingleTonClassObj());

        Driver1 ob1=new Driver1();
        Driver1 ob2=new Driver1();
        Driver1 ob3=new Driver1();
        Driver1 ob4=new Driver1();
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println(ob4);


    }
    
}
