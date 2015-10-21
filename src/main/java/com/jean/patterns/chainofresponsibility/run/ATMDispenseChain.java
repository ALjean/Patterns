package com.jean.patterns.chainofresponsibility.run;

import com.jean.patterns.chainofresponsibility.model.Currency;
import com.jean.patterns.chainofresponsibility.dispense.DispenseChain;
import com.jean.patterns.chainofresponsibility.dispense.impl.Dollar10Dispenser;
import com.jean.patterns.chainofresponsibility.dispense.impl.Dollar20Dispenser;
import com.jean.patterns.chainofresponsibility.dispense.impl.Dollar50Dispenser;

import java.util.Scanner;

/**
 * Created by jean on 02.05.15.
 */
public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain(){
        //init chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        //set the chain of responsibility
        c1.setNextChain(c2);
        c1.setNextChain(c3);
    }

    public static void main(String [] args){
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        while (true){
            int amont = 0;
            System.out.println("Enter amount to display");
            Scanner input = new Scanner(System.in);
            amont = input.nextInt();
            if(amont % 10 != 0){
                System.out.println("Amont should be in multiple of 10s.");
                return;
            }
            atmDispenseChain.c1.dispense(new Currency(amont));

            //process the request


        }
    }
}
