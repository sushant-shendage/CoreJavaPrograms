public class Sub extends Sup {
    @Override
    void supMethod()
    {
        System.out.println("super class non static context updated from sub class");
    }
    
}
