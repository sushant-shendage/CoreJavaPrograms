public class MethodOverloading30june24 {
    public static void main(String[] args) {
        method1(44);
        method1(44.67f);
        method1('D');
        method1("demo");
        
    }

    static void method1(int i)
    {
        System.out.println(" i n t e g e r ");
    }
    static void method1(float f)
    {
        System.out.println(" f l o a t ");
    }
    static void method1(char c)
    {
        System.out.println(" c h a r ");
    }
    static void method1(String s)
    {
        System.out.println(" S t r i n g ");
    }
    
     
}
