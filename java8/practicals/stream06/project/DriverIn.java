// package java8.practicals.stream06.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {

    String name;
    int age;
    int rollNumber;
    long phoneNumber;
    double percentage;

    public Student(String name, int age, int rollNumber, long phoneNumber, double percentage) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", phoneNumber=" + phoneNumber
                + ", percentage=" + percentage + "]";
    }

}

interface StudentInterface {
    void addStudents();

    void displayStudents();

    void removeStudentByRollNumber();

    void sortStudents(String attributeName);

    void totalStudentCount();

    void updateStudentName();

    void getStudentMaxAge();

    void getStudentMaxMarks();

}

class StudentInterfaceImp1 implements StudentInterface {
    List<Student> studentInfo = null;
    Student singleStudent = null;
    static Scanner sc = new Scanner(System.in);

    @Override
    public void addStudents() {
        studentInfo = new ArrayList<Student>();
        System.out.println("Enter number of student want to add :");
        int numberofStudent = sc.nextInt();

        for (int i = 1; i <= numberofStudent; i++) {
            studentInfo.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextLong(), sc.nextDouble()));
        }

    }

    @Override
    public void displayStudents() {
        studentInfo.forEach(System.out::println);
    }

    @Override
    public void removeStudentByRollNumber() {

        System.out.println("Enter student roll number to remove student..!");
        int removeByRollNumber = sc.nextInt();

        if (studentInfo.stream().filter(n -> n.rollNumber == removeByRollNumber).collect(Collectors.toList())
                .size() != 0) {
            singleStudent = studentInfo.stream().filter(n -> n.rollNumber == removeByRollNumber)
                    .collect(Collectors.toList()).get(0);
        }

        if (singleStudent == null) {
            System.out.println("Student not exist..!");
        } else {
            System.out.println("Student exist..!");
            System.out.println(singleStudent);
            studentInfo.remove(singleStudent);
            System.out.println("Student removed successfully..!");
        }
    }


    @Override
    public void sortStudents(String attributeName) {
        System.out.println("enter attribute based on you want to sort student...[name/age]");

        System.out.println(attributeName);
        if (attributeName.equals("name")) {
            studentInfo.sort((o1, o2) -> o1.name.compareTo(o2.name));
            System.out.println("sorted syudents based on name :");
            displayStudents();
        } else if (attributeName.equals("age")) {

            studentInfo.sort((o1, o2) -> o1.age - o2.age);
            System.out.println("sorted students based on age :");
            displayStudents();
        }
    }

    @Override
    public void totalStudentCount() {
        System.out.println("Toatal students :" + studentInfo.size());
    }

    @Override
    public void getStudentMaxAge() {
        System.out.println("max age :" + (studentInfo.stream().max((o1, o2) -> o1.age - o2.age).get().age));
    }

    @Override
    public void getStudentMaxMarks() {
        System.out.println("max marks :"
                + studentInfo.stream().max((o1, o2) -> (int) o1.percentage - (int) o2.percentage).get().percentage);

    }

    @Override
    public void updateStudentName() {
        System.out.println("Enter student roll number to update student..!");
        int removeByRollNumber = sc.nextInt();

        if (studentInfo.stream().filter(n -> n.rollNumber == removeByRollNumber).collect(Collectors.toList())
                .size() != 0) {
            singleStudent = studentInfo.stream().filter(n -> n.rollNumber == removeByRollNumber)
                    .collect(Collectors.toList()).get(0);
        }

        if (singleStudent == null) {
            System.out.println("Student not exist..!");
        } else {
            System.out.println("Student exist..!");
            System.out.println(singleStudent);

            System.out.println("enter new name of above stuent :");
            String newName = sc.next();
            singleStudent.name = newName;
            System.out.println("updated list..!");
            studentInfo.forEach(System.out::println);
            System.out.println("Student Updated successfully..!");
        }
    }
}

public class DriverIn {
    public static void main(String[] args) {
        StudentInterfaceImp1 ob1 = new StudentInterfaceImp1();

        int inputCode = 0;
        do {
            menue();
            System.out.println("Enter the code to perform operation..!");
            inputCode = StudentInterfaceImp1.sc.nextInt();
            switch (inputCode) {
                case 1: {

                    ob1.addStudents();
                    break;
                }
                case 2: {
                    ob1.totalStudentCount();

                    break;
                }
                case 3: {
                    ob1.displayStudents();

                    break;
                }
                case 4: {
                    ob1.removeStudentByRollNumber();

                    break;
                }
                case 5: {
                    ob1.sortStudents("name");

                    break;
                }
                case 6: {
                    ob1.sortStudents("age");

                    break;
                }
                case 7: {
                    ob1.getStudentMaxAge();

                    break;
                }
                case 8: {
                    ob1.getStudentMaxMarks();

                    break;
                }
                case 9: {
                    ob1.updateStudentName();
                    break;
                }
                case 10: {
                    break;
                }

                default: {
                    System.out.println("please enter valid code..!");
                    break;
                }
            }

        } while (inputCode != 10);

        System.out.println("program execution completed..!");

    }

    public static void menue() {
        System.out.println("----------------Menue----------------");
        System.out.println("[ 1 ] : [ Add students               ]");
        System.out.println("[ 2 ] : [ count total students       ]");
        System.out.println("[ 3 ] : [ displayStudents            ]");
        System.out.println("[ 4 ] : [ removeStudentByRollNumber  ]");
        System.out.println("[ 5 ] : [ sortStudents-name          ]");
        System.out.println("[ 6 ] : [ sortStudents-age           ]");
        System.out.println("[ 7 ] : [ getStudentMaxAge           ]");
        System.out.println("[ 8 ] : [ getStudentMaxMarks         ]");
        System.out.println("[ 9 ] : [ updateStudentName          ]");
        System.out.println("[10 ] : [ exit                       ]");

    }
}

