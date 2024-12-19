public class MethodOverloadingDriver {
    public static void main(String[] args) {
        MethodOverloading ob1=new MethodOverloading();

        ob1.method1(34);
        ob1.method1(5656f);
        ob1.method1(456.57);
        ob1.method1('t');
        ob1.method1("demo-string");
    }
}
