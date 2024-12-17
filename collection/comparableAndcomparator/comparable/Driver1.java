// package javapgms.collection.comparableAndcomparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("A-user1", 20));
        users.add(new User("B-user2", 32));
        users.add(new User("C-user3", 44));
        users.add(new User("D-user4", 18));
        for (User user : users) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println("=============================");
        // for (User user : users) {
        //     System.out.println(user);
        // }

        // users.sort((s1, s2) -> s1.getUserName().compareTo(s2.getUserName()));
        // System.out.println("=============================");
        // for (User user : users) {
        //     System.out.println(user);
        // }
    }
}

class User implements Comparable<User> {
    String userName;
    int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Comparable <User> userCompareAge=s->s.age - this.age;
    @Override
    public int compareTo(User other) {
        // Compare by marks (ascending order)
        return  userCompareAge.compareTo(other);
    }

    @Override
    public String toString() {
        return "User{id=" + userName + ", age=" + age;
    }

}
