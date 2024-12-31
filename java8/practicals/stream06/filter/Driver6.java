import java.util.ArrayList;
import java.util.List;

public class Driver6 {
   public static void main(String[] args) {
    List <Teacher> teacherInfo=new ArrayList<>();

    teacherInfo.add(new Teacher(67, "acudb"));
    teacherInfo.add(new Teacher(78, "xy"));
    teacherInfo.add(new Teacher(90, "prxsq"));
    teacherInfo.add(new Teacher(120, "cd"));

    teacherInfo.stream().filter(n -> n.teachername.length()==5).forEach(e -> System.out.println(e));


   } 
}

class Teacher {
    int teacherId;
String teachername;

public Teacher(int teacherId, String teachername) {
    this.teacherId = teacherId;
    this.teachername = teachername;
}

@Override
public String toString() {
    return "Teacher [teacherId=" + teacherId + ", teachername=" + teachername + "]";
}

}