package com.frankie.dsiterator.snapshot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 8, 2));

        SnapshotIterator1<Integer> iterator1 = new SnapshotIterator1<>(list);
        list.remove(Integer.valueOf(2));
        SnapshotIterator1<Integer> iterator2 = new SnapshotIterator1<>(list);
        list.remove(Integer.valueOf(3));
        SnapshotIterator1<Integer> iterator3 = new SnapshotIterator1<>(list);

        System.out.println("=========================== SnapshotIterator1 =========================== ");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + " ");
        }

        System.out.println("=========================== SnapshotIterator2 =========================== ");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }

        System.out.println("=========================== SnapshotIterator3 =========================== ");
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next() + " ");
        }
    }
}
