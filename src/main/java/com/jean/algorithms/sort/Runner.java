package com.jean.algorithms.sort;

import com.jean.algorithms.sort.impl.MergeSortImpl;
import com.jean.algorithms.sort.impl.SelectionSortImpl;

public class Runner {
    public static void main(String ... args){
//        Sort sort = new SelectionSortImpl(10);
//        sort.insert(12);
//        sort.insert(13);
//        sort.insert(1);
//        sort.insert(132);
//        sort.insert(4);
//        sort.insert(5);
//        sort.insert(3);
//        sort.insert(8);
//        sort.insert(7);
//        sort.display();
//        sort.sort();
//        sort.display();


        MergeSortImpl mergeSort = new MergeSortImpl();

        int[] a = {23, 47,81, 95};
        int[] b = {7, 14, 39, 55, 62, 74};
        int[] c = new int[a.length + b.length];

        mergeSort.merge(a, b, c);
        mergeSort.display(c);

    }
}
