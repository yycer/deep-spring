package com.frankie.dsiterator.snapshot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnapshotIterator1<E> implements Iterator<E> {
    private List<E> elements;
    private int currentIndex;

    public SnapshotIterator1(List<E> elements) {
        this.elements = new ArrayList<E>();
        this.elements.addAll(elements);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public E next() {
        return elements.get(currentIndex++);
    }
}
