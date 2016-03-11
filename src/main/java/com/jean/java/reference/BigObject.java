package com.jean.java.reference;

public class BigObject {
    private int value;

    BigObject(Integer value) {
        this.value = value;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("BigObject (" + value + ") finalize()");
    }

    @Override
    public String toString() {
        return value + "";
    }

}
