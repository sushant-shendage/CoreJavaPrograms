public class ObBp2Driver {
    public static void main(String[] args) {

        ObBp2 ob1=new ObBp2(1);
        ObBp2 ob2=new ObBp2(2,3);
        ObBp2 ob3=new ObBp2(4,5,6);
        ObBp2 ob4=new ObBp2(7,8,9,10);

        
        ob1.displayObBp2();
        ob2.displayObBp2();
        ob3.displayObBp2();
        ob4.displayObBp2();

        ob4.att1();
        System.out.println("----------");
        ob4.att1().att2();
        System.out.println("----------");
        ob4.att1().att2().att3();
        System.out.println("----------");
        ob4.att1().att2().att3().att4();

        
    }
    
}
