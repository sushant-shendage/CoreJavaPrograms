// package InnerClasses2025;

// import InnerClasses2025.OuterClass.InnerStaticClass;

//static inner class
public class Driver1 {
    public static void main(String[] args) {
 


 Interface1 ob=new Interface1() {
    @Override
    public void m11() {
       System.out.println("m11");
    }
 };

 ob.m11();

 AbstractClass1 ob2=new AbstractClass1() {
    @Override
    void m22() {
        System.out.println("m22");
    }
 };
 
 ob2.m22();

    }
}

class OuterClass {
     //static inner class
      static class InnerStaticClass {
        int k = 30;
        static int l = 40;
    }
}

//Member inner class
class OuterClass2{
    class MemberInnerClass{
        int m=50;
        static int n=60;

    }
}


//Local inner class
class Outer3{
    static void m1(){
        class LocalInnerClass1{
            int o=70;
            static int p=80;
        } 
    }
}

interface Interface1{
    void m11();
}


abstract class AbstractClass1{
    abstract void m22();
}

 