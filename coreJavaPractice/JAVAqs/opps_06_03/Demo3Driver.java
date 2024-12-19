public class Demo3Driver {
    public static void main(String[] args) {
        Demo3 ob1=new Demo3();
        ob1.allDetails();

        Demo3 ob2=new Demo3("one","two","three");
        ob2.allDetails();

        Demo3 ob3=new Demo3("four","five");
        ob3.allDetails();

        Demo3 ob4=new Demo3("one","two","three","four","five");
        ob4.allDetails();
    }
    
}
