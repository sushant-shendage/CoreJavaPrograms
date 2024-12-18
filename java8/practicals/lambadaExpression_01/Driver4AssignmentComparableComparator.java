import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver4AssignmentComparableComparator {
    public static void main(String[] args) {
        List<UserInfo> userInfoList=new ArrayList<>();

        userInfoList.add(new UserInfo("AB-name1", 123));
        userInfoList.add(new UserInfo("AA-name1", 456));
        userInfoList.add(new UserInfo("C-name1", 789));
        userInfoList.add(new UserInfo("D-name1", 126));
        userInfoList.forEach(System.out::println);

        System.out.println("------sorting using comparable-------------------------------------");
        
        Collections.sort(userInfoList);
        userInfoList.forEach(System.out::println);
        System.out.println("----------sorting using comparator---------------------------------");
        userInfoList.sort((o1,o2)->o2.name.compareTo(o1.name));
        userInfoList.forEach(System.out::println);

        
    }
}
class UserInfo implements Comparable<UserInfo>{
    String name;
    int id;
    public UserInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //lambda expression to sort object in desending order..!
    Comparable<UserInfo> comparableObject = o -> o.name.compareTo(this.name);

@Override
public int compareTo(UserInfo o) {
return  comparableObject.compareTo(o);
}
    @Override
    public String toString() {
        return "id :"+id+" name :"+name;
    }


}
