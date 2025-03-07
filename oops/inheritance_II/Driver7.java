public class Driver7 {
   public static void main(String[] args) {
    new Child1().nonStaticMethod();
   }
}

    class Parent1{
        void nonStaticMethod(){
            System.out.println("nonstatic method1");
        }
    }
    class Child1 extends Parent1{

    }
