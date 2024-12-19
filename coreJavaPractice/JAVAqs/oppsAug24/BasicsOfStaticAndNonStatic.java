
public class BasicsOfStaticAndNonStatic {

    public static final String IntVar1 = null;
    static int intVar1;
    //intVar1=77;
    //oops_1]always we have to initilize value in block only.we can't initilize (outside any block && outside class block)
    //    we can use static variabe inside
    //    static block[??]/ static method[??]/non- static method[??]/constructor/ static method[??]
    //non-static initilizers(non-static variaclea s/non-static blocks) get exicuted before loading process of object) [??]
    //static initilizers(static variaclea s/static blocks) get exicuted before loading process of class 

    static {
        
        System.out.println("this is  static block 1");
        System.out.println("printing global static variable's default value in static block :  intVar1 ::"+intVar1);//oops_1
        intVar1=44;
        System.out.println("printing global static variable's initilized value in static block :  intVar1 ::"+intVar1);//oops_1
        intVar1=45;
        System.out.println("printing global static variable's reinitilized value in static block :  intVar1 ::"+intVar1);//oops_1
    }

    public static void main(String[] args) {

         intVar1=46;
         System.out.println("printing global static variable's  2nd time reinitilized value in main method :  intVar1 ::"+intVar1);//oops_1

    }

    static {
        System.out.println("this is  static block 2");
    }
    static {
        System.out.println("this is  static block 3");
    }
    static {
        System.out.println("this is static block 4");
    }
}
