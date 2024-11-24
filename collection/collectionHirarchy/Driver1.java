// package javapgms.collection.collectionHirarchy;

import java.util.ArrayList;
import java.util.List;

public class Driver1 {
    public static void main(String[] args) {
        List firstList=new ArrayList();
        firstList.add('c');
        firstList.add("demoString");
        firstList.add(132434534);
        firstList.add(132434534l);
        firstList.add(132434.534f);
        firstList.add(new String("string using string class"));

        firstList.add(new int[5]);

        


        System.out.println(firstList);
    }
}
