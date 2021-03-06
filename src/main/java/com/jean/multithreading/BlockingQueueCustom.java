package com.jean.multithreading;

public interface BlockingQueueCustom<E> {

    void put(E item) throws InterruptedException;

    E take() throws InterruptedException;
    int size();
}
