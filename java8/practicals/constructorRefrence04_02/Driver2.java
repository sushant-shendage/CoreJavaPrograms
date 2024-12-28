// package javapgms.java8.practicals.random;

class Student {
    Student() {
        System.out.println("student with no-argument constructor..!");
    }

    Student(int i, int i2) {
        System.out.println("student  constructor with 1 argument..!");
    }
}

@FunctionalInterface
interface studentInterface {
    Student getStudent(int i1, int i2);
}

public class Driver2 {
    public static void main(String[] args) {
        studentInterface s1 = Student::new;

        System.out.println(s1);
    }
}
