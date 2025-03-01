public class Driver2 {
    public static void main(String[] args) {
        new Parent1();
        new Parent1('f');
    }
}
class Parent1{
    Parent1(){
System.out.println("constructor with no-arguments");
    }
    Parent1(char c){
        System.out.println("constructor with single char-argument");

    }
}

