package com.frankie.dsiterator.unspecifiedbehavior;

import com.frankie.dsiterator.v1.MyIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        // 1. remove case 1
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        MyIterator<String> myIterator1 = new MyIterator<>(list1);
        System.out.println("iterator1 next: " + myIterator1.next());
        list1.remove("a");

        while (myIterator1.hasNext()) {
            System.out.println(myIterator1.next());
        }

        // 2. remove case 2
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        MyIterator<String> myIterator2 = new MyIterator<>(list2);
        System.out.println("iterator2 next: " + myIterator2.next());
        list2.remove("c");

        while (myIterator2.hasNext()) {
            System.out.println(myIterator2.next());
        }

        // 3. add case 1
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        MyIterator<String> myIterator3 = new MyIterator<>(list3);
        System.out.println("iterator3 next: " + myIterator3.next());
        list3.add(0, "z");

        while (myIterator3.hasNext()) {
            System.out.println(myIterator3.next());
        }
    }
}
