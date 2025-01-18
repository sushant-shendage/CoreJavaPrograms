// package FileIpOpstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Driver2IS {
    public static void main(String[] args) throws Exception{
            FileInputStream f1=new FileInputStream("fileOutputStream.txt") ;
        
        ObjectInputStream f2=new ObjectInputStream(f1);
        Student s1=(Student)f2.readObject();
        System.out.println(s1);

System.out.println("object read successfully..!");
        // FileInputStream fs=new FileInputStream("abc.txt");
    }
}

class Student implements Serializable{
    String name;
    int age;
    Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}
