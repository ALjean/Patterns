package com.jean.utils.generator.impl;


import com.jean.utils.generator.RandomDataGenerator;

import java.util.Random;

public class InitDataServiceProvider implements RandomDataGenerator {

    private static InitDataServiceProvider initDataServiceProvider;

    private static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";

    private static final Integer defStringSize = 15;
    private static final Integer defIntegerSize = 3;


    private InitDataServiceProvider(){}

    public static InitDataServiceProvider getInstance(){
        if(initDataServiceProvider == null){
            initDataServiceProvider = new InitDataServiceProvider();
        }
        return initDataServiceProvider;
    }

    //Gen random string value
    public String getRandomString(int length){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++){
            stringBuilder.append(AB.charAt(random.nextInt(AB.length())));

        }

        return  stringBuilder.toString();
    }

    @Override
    public String getRandomString() {
        return getRandomString(defStringSize);
    }

    //Gen random integer value
    public int getRandomInteger(int length){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++){
            stringBuilder.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));

        }

        return Integer.parseInt(stringBuilder.toString());

    }

    @Override
    public int getRandomInteger() {
        return getRandomInteger(defIntegerSize);
    }


}
