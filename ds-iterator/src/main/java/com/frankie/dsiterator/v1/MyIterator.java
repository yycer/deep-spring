package com.frankie.dsiterator.v1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private List<T> elements;
    private int currentIndex;

    public MyIterator(List<T> elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements.get(currentIndex++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
