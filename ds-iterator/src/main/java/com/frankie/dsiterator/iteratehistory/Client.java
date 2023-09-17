package com.frankie.dsiterator.iteratehistory;

import java.util.*;
import java.util.stream.StreamSupport;

public class Client {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        // 1. Enumeration
        System.out.println("=========================== 1. Enumeration ===========================");
        Vector<Object> vector = new Vector<>(10);
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");

        Enumeration<Object> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // 2. Iterator
        System.out.println("=========================== 2. Iterator ===========================");
        Iterator<String> iterator = new ArrayList<>(list).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. For-each
        System.out.println("=========================== 3. For-each ===========================");
        for (String element : list) {
            System.out.println(element);
        }

        // 4. Stream API
        System.out.println("=========================== 4. Stream API ===========================");
        // list.stream().forEach(System.out::println);
        list.forEach(System.out::println);

        // 5. Stream API - Spliterator
        System.out.println("=========================== 5. Stream API - Spliterator ===========================");
        Spliterator<String> spliterator = Spliterators.spliteratorUnknownSize(list.iterator(),
                Spliterator.SIZED | Spliterator.ORDERED | Spliterator.DISTINCT);
        StreamSupport.stream(spliterator, true).forEach(System.out::println);
    }
}
