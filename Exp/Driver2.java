public class Driver2 {
    public static void main(String[] args) {
        Child1 ob1=new Child1();
        
    }
}

class Parent{

    {
        System.out.println("parent non-static block..!");
    }

      private int pivateInstanceVar=56;
    Parent(){
        System.out.println("this is parent constructor..!");
    }
}

class Child1 extends Parent{

    Child1(){
        System.out.println("this is child constructor..!");
    }
}
//not completed yet..!