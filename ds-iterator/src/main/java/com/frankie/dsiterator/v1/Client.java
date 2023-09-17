package com.frankie.dsiterator.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        MyIterator<String> iterator = new MyIterator<>(names);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
