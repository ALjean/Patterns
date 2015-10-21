package com.jean.patterns.chainofresponsibility.dispense;

import com.jean.patterns.chainofresponsibility.model.Currency;

/**
 * Created by jean on 02.05.15.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
