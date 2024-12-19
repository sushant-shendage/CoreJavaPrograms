// package oops_06_02.Constructor_chaining_04;

public class Mc_Obj1Driver 
{
    public static void main(String[]args)
    {
        Mc_Obj1 ob1=new Mc_Obj1();
        System.out.println("displaying static and non-static methods");
        ob1.displayMsg1();
        ob1.displayMsg2();
        System.out.println("displaying static  method chaining");
         System.out.println(ob1);
        ob1.displayMsg3().displayMsg32().displayMsg4();//method chaining
         
       
    }
}
