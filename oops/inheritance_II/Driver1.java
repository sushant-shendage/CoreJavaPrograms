// package javapgms.oops.inheritance_II;

public class Driver1 {
    public static void main(String[] args) {
        ParentAc1 obj1=new ParentAc1();

        obj1.parentMethod();
    }
}

class ParentA{
   public   static void parentMethod(){
    System.out.println("parent method..!");
    }
     
}

class ParentAc1 extends ParentA{
}
