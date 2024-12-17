import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver4ComparatorAssignment {
    public static void main(String[] args) {
        List<PersonInfo> pIList=new ArrayList<>();
        pIList.add(new PersonInfo(4, "Z-name1", 45.77f));
        pIList.add(new PersonInfo(7, "A-name2", 95.90f));
        pIList.add(new PersonInfo(2, "P-name3", 59.67f));
        pIList.add(new PersonInfo(56, "H-name4", 49.34f));
        System.out.println(pIList);

        Collections.sort(pIList,(o1,o2)->o1.id-o2.id );
        System.out.println(pIList);


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