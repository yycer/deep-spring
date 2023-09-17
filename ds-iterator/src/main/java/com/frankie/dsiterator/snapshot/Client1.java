package com.frankie.dsiterator.snapshot;

import com.frankie.dsiterator.v1.MyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 8, 2));

        MyIterator<Integer> iterator1 = new MyIterator<>(list);
        list.remove(Integer.valueOf(2));
        MyIterator<Integer> iterator2 = new MyIterator<>(list);
        list.remove(Integer.valueOf(3));
        MyIterator<Integer> iterator3 = new MyIterator<>(list);

        System.out.println("=========================== iterator1 =========================== ");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + " ");
        }

        System.out.println("=========================== iterator2 =========================== ");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }

        System.out.println("=========================== iterator3 =========================== ");
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next() + " ");
        }
    }
}
