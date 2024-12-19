import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student s[]=new Student[3];

        s[0]=new Student("student1",21,"CSE");
        s[1]=new Student("student2",22,"IT");
        s[2]=new Student("student3",23,"ENTC");

        System.out.println(s);
        System.out.println(Arrays.toString(s));

        ArrayList al1=new ArrayList<>();

        al1.add(new Student("student1",21,"CSE"));
        al1.add(new Student("student2",22,"IT"));
        al1.add(new Student("student3",23,"ENTC"));

        for (Object o : al1) {
            Student s2 =(Student) o;
            System.out.println(s2.name);
        }


        ArrayList fruits=new ArrayList<>();
        fruits.add("fruit1");
        fruits.add("fruit2");
        fruits.add("fruit3");
        fruits.add("fruit4");
        fruits.add("fruit5");

        ArrayList veg=new ArrayList<>();
        veg.add("veg1");
        veg.add("veg2");
        veg.add("veg3");
        veg.add("veg4");
        veg.add("veg5");


        System.out.println(fruits);
        System.out.println(veg);

        System.out.println();



    }
}
