package com.jean.algorithms.sort;

public abstract class Sort {

    protected long[] array;
    protected int nElements;

    public void insert(long value) {
        array[nElements] = value;
        nElements++;
    }

    public void display() {
        for (long l : array) {
            System.out.print(" " + l);
        }
        System.out.println();
    }

    protected void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public abstract void sort();
}
