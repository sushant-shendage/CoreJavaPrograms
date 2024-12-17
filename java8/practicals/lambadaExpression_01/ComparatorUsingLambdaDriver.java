import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsingLambdaDriver {
    public static void main(String[] args) {
        List <PersonDetails> personInfo=new ArrayList<>(); 
        personInfo.add(new PersonDetails("A-person", 25, 200000));
        personInfo.add(new PersonDetails("D-person", 56, 56000));
        personInfo.add(new PersonDetails("C-person", 45, 70000));
        personInfo.add(new PersonDetails("B-person", 19, 68000));
        //orginal list
        System.out.println("orginal list");
        personInfo.forEach(System.out::println);
        
        //
        System.out.println();
        System.out.println("sorting based on age using comparator with lambda expression..!");
        personInfo.sort((o1,o2)->o1.personAge-o2.personAge);
        personInfo.forEach(System.out::println);
        
        //
        System.out.println();
        System.out.println("sorting based on name using comparator with lambda expression..!");
        personInfo.sort((o1,o2)->o1.personName.charAt(0)-o2.personName.charAt(0));
        personInfo.forEach(System.out::println);


    }
}

class PersonDetails{
    String personName;
    int personAge;
    float personSalary;
    public PersonDetails(String personName, int personAge, float personSalary) {
        this.personName = personName;
        this.personAge = personAge;
        this.personSalary = personSalary;
    }

 
    @Override
    public String toString() {
        return "PersonDetails [personName=" + personName + ", personAge=" + personAge + ", personSalary=" + personSalary
                + "]";
    }

}
