public class Driver2 {
    public static void main(String[] args) {
        ParentAc1c1 object1=new ParentAc1c1();
      
        object1.pc1c1Method();
    }
}

class ParentA{
    public static void parentMethod(){
        System.out.println("P");
    }
}

class ParentAc1 extends ParentA{
    public static void pc1Method(){
        System.out.println("pc1");
    }
}

class ParentAc1c1 extends ParentAc1{
    public static void pc1c1Method(){
        parentMethod();
        pc1Method();
        System.out.println("pc1c1");
    }
}
