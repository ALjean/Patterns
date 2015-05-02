package com.jean.chainofresponsibility.model;

/**
 * Created by jean on 02.05.15.
 */
public class Currency {

    private int amount;

    public Currency(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return  this.amount;
    }
}
