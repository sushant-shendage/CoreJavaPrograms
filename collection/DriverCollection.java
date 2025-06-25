import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class DriverCollection{
    public static void main(String[] args) {
        List <String> listString=new ArrayList<String>();

        listString.add("the");
        listString.add("black");
        listString.add("brown");
        listString.add("fox");
        listString.add("jumps");
        listString.add("over");
        listString.add("lazy");
        listString.add("pink");
        listString.add("dog");

        //foreach with method refrence
        listString.forEach(System.out::println);
System.out.println("using for each and print() method refrence---------------------");
        //foreach with consumer
        listString.forEach(e->System.out.println(e));

        //for-loop
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
System.out.println("using for loop---------------------");

Iterator <String> iteratorVar=listString.iterator();
while (iteratorVar.hasNext()) {
    System.out.println(iteratorVar.next());
}
System.out.println("using   iterator---------------------");

ListIterator <String> listIteratorVar=listString.listIterator();
while (listIteratorVar.hasPrevious()) {
    System.out.println(listIteratorVar.previous());
}
System.out.println("using list iterator---------------------");




//pyramid patteren..!
int rows=11;
for (int i = 1,j=0; i <= rows; i++) {
    if (i<= (rows/2)+1)
    j++;
    else
    j--;
for (int j2 = 1; j2 <= i; j2++) {
    System.out.print("- ");
 }

 for (int j2 = 1; j2 <= j; j2++) {
    System.out.print("*");
 }
 System.out.println();
}


    }
}