package com.jean.patterns.iterator.impl;

import com.jean.patterns.iterator.Container;
import com.jean.patterns.iterator.Iterator;

/**
 * Created by jean on 24.01.16.
 */
public class NameRepository implements Container {

    private String []names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }
    }

}
