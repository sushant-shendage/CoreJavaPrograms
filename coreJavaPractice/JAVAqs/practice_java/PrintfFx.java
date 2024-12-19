public class PrintfFx {
    public static void main(int a)
    {
        System.out.println("main method int content"); 
    }
    public static void main(char a)
    {
        System.out.println("main method char content");
    }
    public static void main(String[] args) {
        main(55);
        main('t');
    }
    
}
