package com.jean.algorithms.impl;

import com.jean.algorithms.Sort;

public class BubbleSortImpl implements Sort {

    private long[] array;
    private int nElements;

    public BubbleSortImpl(int max) {
        this.array = new long[max];
        this.nElements = 0;
    }

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

    public void sort() {
        int in, out;
        for (out = nElements - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1])
                    swap(in, in+1);
            }
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }


}
