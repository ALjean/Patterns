package com.jean.algorithms;

import com.jean.algorithms.impl.BubbleSortImpl;

public class Runner {
    public static void main(String ... args){
        Sort sort = new BubbleSortImpl(10);
        sort.insert(12);
        sort.insert(13);
        sort.insert(1);
        sort.insert(132);
        sort.insert(4);
        sort.insert(5);
        sort.insert(3);
        sort.insert(8);
        sort.insert(7);
        sort.display();
        sort.sort();
        sort.display();

    }
}
