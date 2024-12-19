package javapgms.java8.practicals.lambadaExpressionAndFunctionalInterface_01;
// package javapgms.java8.practicals.lambadaExpression_01;
public class Driver1  {
    
    public static void main(String[] args) {
        //without using   java 1.8
        printMesssage();
        add(4, 6);

        //using java 1.8
        Fxinterface1 lmbdaExVar1=()->System.out.println("display first msg..!");
        lmbdaExVar1.display();

        lmbdaExVar1=()->System.out.println("second msg..!");
        lmbdaExVar1.display();
    }

    static void printMesssage(){
        System.out.println("display message..!");
    }
    static void add(int a,int b){
        System.out.println("Addition :"+(a+b));
    }
}

interface Fxinterface1{
    void display();
}
 
//day1
