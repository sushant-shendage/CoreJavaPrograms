import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver4ComparatorAssignment {
    public static void main(String[] args) {
        List<PersonInfo> pIList=new ArrayList<>();
        pIList.add(new PersonInfo(4, "A-name1", 45.77f));
        pIList.add(new PersonInfo(7, "A-name2", 95.90f));
        pIList.add(new PersonInfo(49, "A-name3", 59.67f));
        pIList.add(new PersonInfo(6, "A-name4", 49.34f));
        System.out.println(pIList);

        //id based comparision
        Collections.sort(pIList,(o1,o2)->o1.id-o2.id );
       
        //name and id based comparison using comparator
        Collections.sort(pIList,(o1,o2)->(o1.name.charAt(0)!=o2.name.charAt(0))?o1.name.charAt(0)-o2.name.charAt(0):(o1.id!=o2.id)?o1.id-o2.id:0 );

        pIList.forEach(System.out::println);


    }
}
class PersonInfo{
    int id;
    String name;
    float percentage;
    public PersonInfo(int id, String name, float percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPercentage() {
        return percentage;
    }
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    @Override
    public String toString() {
        return "PersonInfo [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
    }
    
}