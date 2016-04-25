package com.jean.algorithms.sort.impl;

public class MergeSortImpl {

    public void merge(int [] arrayA, int [] arrayB, int[] arrayC){
        int sizeA = arrayA.length;
        int sizeB = arrayB.length;

        int aDex = 0;
        int bDex = 0;
        int cDex = 0;

        while (sizeA > aDex && sizeB > bDex){
            if(arrayA[aDex] < arrayB[bDex]){
                arrayC[cDex++] = arrayA[aDex++];
            }else{
                arrayC[cDex++] = arrayB[aDex++];
            }
        }
        /*Array B isEmpty */
        while (aDex < sizeA){
            arrayC[cDex++] = arrayA[aDex++];
        }

        /*Array A isEmpty */
        while (bDex < sizeB){
            arrayC[cDex++] = arrayB[bDex++];
        }

    }

    public void display(int[] array){
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        for (int anArray : array) {
            builder.append(anArray).append(",");
        }

        builder.append("]");

        System.out.println(builder);
    }
}
