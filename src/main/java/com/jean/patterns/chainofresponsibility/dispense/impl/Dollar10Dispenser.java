package com.jean.patterns.chainofresponsibility.dispense.impl;

import com.jean.patterns.chainofresponsibility.model.Currency;
import com.jean.patterns.chainofresponsibility.dispense.DispenseChain;

/**
 * Created by jean on 02.05.15.
 */
public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain dispenseChain;

    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10){
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if(remainder != 0)
                this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
