import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Driver4AssignmentComparable {
    public static void main(String[] args) {
        List<UserInfo> userInfoList=new ArrayList<>();

        userInfoList.add(new UserInfo("name1", 123));
        userInfoList.add(new UserInfo("name1", 456));
        userInfoList.add(new UserInfo("name1", 789));
        userInfoList.add(new UserInfo("name1", 126));
        System.out.println(userInfoList);

        Collections.sort(userInfoList);
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


@Override
public int compareTo(UserInfo o) {
return (o.id!=this.id)?0:(this.id>o.id)?1:0;
}
    @Override
    public String toString() {
        return "id :"+id+" name :"+name;
    }

    Comparable<UserInfo> comparableObject = o -> this.id-o.id;

}
