package com.jean.chainofresponsibility.dispense;

import com.jean.chainofresponsibility.model.Currency;

/**
 * Created by jean on 02.05.15.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
