// package java8.practicals.stream06.project;


class Student{

    String name;
    int age;
    int rollNumber;
    int phoneNumber;
    double percentage;
    @Override
    public String toString() {
        return "Student [name=" + name + "\n age=" + age + ",\n rollNumber=" + rollNumber + "\n phoneNumber=" + phoneNumber
                + ",\n percentage=" + percentage + "]\n================================";
    }
}

public interface StudentInterface {
    void addStudent();
    void displayStudent();
    void removeStudent();
    void sortStudent();
    void totalStudentCount();
    void updateStudent();
    void getStudentMaxAge();
    void getStudentMaxMarks();

}

public class StudentInterfaceImp1{}