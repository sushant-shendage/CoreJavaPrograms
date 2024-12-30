// package javapgms.java8.practicals.stream06;

import java.util.ArrayList;
import java.util.List;

public class Driver3 {
    public static void main(String[] args) {
        ArrayList<Student> studentInfo= new ArrayList<Student>();
        studentInfo.add(new Student(101, "Aname1", "add1"));
        studentInfo.add(new Student(101, "Aname1", "add2"));
        studentInfo.add(new Student(101, "Bname1", "add3"));
        studentInfo.add(new Student(101, "Cname1", "add4"));

        studentInfo.stream().filter(n->n.name.charAt(0)=='A').forEach(e->System.out.println(e));
    }
}
class Student{
int id;
String name;
String addr;


public Student(int id, String name, String add) {
    this.id = id;
    this.name = name;
    this.addr = add;
}


@Override
public String toString() {
    return "student [id=" + id + ", name=" + name + ", add=" + addr + "]";
}

}
