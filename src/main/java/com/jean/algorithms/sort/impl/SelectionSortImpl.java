package com.jean.algorithms.sort.impl;

import com.jean.algorithms.sort.Sort;

public class SelectionSortImpl extends Sort {

    public SelectionSortImpl(int max) {
        array = new long[max];
        nElements = 0;
    }
    @Override
    public void sort() {
        int in, out, min;

        for(out = 0; out < nElements; out++){
            min = out;
            for(in=out+1; in<nElements; in++){
                if(array[in] < array[min])
                    min = in;
            }
            swap(out, min);
        }
    }
}
