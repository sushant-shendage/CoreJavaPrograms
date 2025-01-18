// package FileIpOpstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Driver1StoringObjectinFile  {
    public static void main(String[] args) throws Exception{
            FileOutputStream f1=new FileOutputStream("fileOutputStream.txt") ;
        
        ObjectOutputStream f2=new ObjectOutputStream(f1);
        f2.writeObject(new Student("student1",21));

System.out.println("object written successfully..!");
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
