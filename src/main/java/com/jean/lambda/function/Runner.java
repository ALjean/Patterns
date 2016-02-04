package com.jean.lambda.function;


import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String ... args){
//        sum all number
        CustomFunction customFunction = stream -> stream.reduce((a, b) -> a + b).get();





        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(34);
        list.add(41);
        list.add(51);
        list.add(21);
        int sum = customFunction.sum(list.stream());
        System.out.println(sum);


    }
}
