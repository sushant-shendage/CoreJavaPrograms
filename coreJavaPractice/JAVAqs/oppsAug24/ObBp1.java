

public class ObBp1 {

    int nonSvar1=111,nonSvar2=222,nonSvar3=333,nonSvar4=444;

    ObBp1()
    {
        System.out.println("this is the instruction from no argument constructor of blueprint");
        {
            System.out.println("called global static variable in constructor ob blueprint lass intVar1 ::"+BasicsOfStaticAndNonStatic.intVar1);
            System.out.println("this is non-static block1 in BP's constructor");
        }
    }
 

    static int staticIntVar1=44;

    {
System.out.println("this is non-static block1 in BP");//opps_2
}

static
{
    System.out.println("this is static block1 in BP");//opps_2
    }
    
}
