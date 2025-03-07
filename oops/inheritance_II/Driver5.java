public class Driver5 {
public static void main(String[] args) {
     Parent1 p1=new Child1(56);
    System.out.println(p1.i);
}
}

class Parent1 {
    int i;
    Parent1(int i) {
this.i=i;
System.out.println("parent class constructor..:"+i);
    }
}

class Child1 extends Parent1 {
    Child1(int i) {
        super(i);
    }
}