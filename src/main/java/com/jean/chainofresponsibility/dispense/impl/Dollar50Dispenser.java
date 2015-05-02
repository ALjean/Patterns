package com.jean.chainofresponsibility.dispense.impl;

import com.jean.chainofresponsibility.model.Currency;
import com.jean.chainofresponsibility.dispense.DispenseChain;

/**
 * Created by jean on 02.05.15.
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if(remainder != 0)
                this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
