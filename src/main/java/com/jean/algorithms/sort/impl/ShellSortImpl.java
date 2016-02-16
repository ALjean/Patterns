package com.jean.algorithms.sort.impl;

import com.jean.algorithms.sort.Sort;

public class ShellSortImpl extends Sort {


    @Override
    public void sort() {
        int inner, outer;
        long temp;
        int h = 1;

        //Khnut says h = (h - 1) / 3
        while (h < nElements / 3){
            h = h * 3 + 1;
        }

        while (h > 0){
            for (outer = h; outer < nElements; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > h-1 && array[inner - h] >= temp){
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }

    }
}
