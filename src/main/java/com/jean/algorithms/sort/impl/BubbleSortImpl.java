package com.jean.algorithms.sort.impl;

import com.jean.algorithms.sort.Sort;

public class BubbleSortImpl extends Sort {

    public BubbleSortImpl(int max) {
        array = new long[max];
        nElements = 0;
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




}
