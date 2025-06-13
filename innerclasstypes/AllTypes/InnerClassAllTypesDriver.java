package AllTypes;

public class InnerClassAllTypesDriver {
    public static void main(String[] args) {
        
    }
}


class Outer1{
    static class staticInner1{}
}

class Outer2{
      class instanceInner1{}
}

class Outer3{
       void m1(){
        class LocalInner{};
       }

       void m2(){
        class LocalInner2{};
       }
}


interface Interface1{
     void im1();
}

class Outer4{
    public static void main(String[] args) {
        new Interface1() {
            @Override
            public void im1() {
               System.out.println("this is ima1");
            }
        }.im1();

        
    }
   
}