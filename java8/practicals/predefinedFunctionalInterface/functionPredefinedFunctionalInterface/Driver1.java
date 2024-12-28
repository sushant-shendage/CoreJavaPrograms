// package javapgms.java8.practicals.predefinedFunctionalInterface.functionPredefinedFunctionalInterface;
import java.util.function.Function;

public class Driver1 {
    public static void main(String[] args) {
        Function<Integer, String> f1=n->n+"* 3 :"+(n*3)+"";
        System.out.println( f1.apply(5));
        System.out.println( f1.apply(1));

        f1=n-> "Square :"+n+"*"+n+" ="+(n*n)+" ";
        System.out.println( f1.apply(5));
        System.out.println( f1.apply(1));


        Function<String, Character > f2=n->n.charAt(0);
        System.out.println(f2.apply("this"));

        Function<String, String > f3=n->n.substring(0,2);
        System.out.println(f3.apply("this"));

        f3=n->"length of given string :"+n.length()+"";
        System.out.println(f3.apply("this"));
    }
}
