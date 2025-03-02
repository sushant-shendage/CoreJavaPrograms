// package javapgms.oops.classConcept;

public class Driver1 {
    public static void main(String[] args) {
        ClassVar var1;
        ClassVar var2=ClassVar.creatInstance();//creatInstance is factory method

        System.out.println("program execution completed..!");//A
    }
}

class ClassVar{
    static {
        System.out.println("first static block");//B
    }
private ClassVar(){
}

static ClassVar creatInstance(){
    //C
    System.out.println("creating instance using helper method present in class itself making constructor private and later creating instance in static method of class");
    return new ClassVar();}
}
/*
 * Guess the output
 * B->C->A
*/