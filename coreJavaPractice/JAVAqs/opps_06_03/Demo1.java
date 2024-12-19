public class Demo1 {

//method overloading
public static void main(String[] args) {
    method1(45);
    method1(4.5f);
    method1('C');
    method1("string");
    
}

static void method1(int a)
{
System.out.println("Integer input");
}

static void method1(float a)
{
System.out.println("Float input");
}
static void method1(char a)
{
System.out.println("Char input");
}
static void method1(String a)
{
System.out.println("String input");
}
    
}
