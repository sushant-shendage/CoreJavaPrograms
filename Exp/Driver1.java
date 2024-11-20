public class Driver1{
    public static void main(String[] args) {
        Driver1.NestedClass1 ob1=new NestedClass1();
        Driver1.NestedNonStaticClass1 ob2=(new Driver1()).new NestedNonStaticClass1();

         
    }

    
    static class NestedClass1{
        NestedClass1(){
            System.out.println("nested class 1 constructor");
        }
    }
      class NestedNonStaticClass1{
        NestedNonStaticClass1(){
            System.out.println("nested non static class 1 constructor");
        }
    }
}
//IMP********************