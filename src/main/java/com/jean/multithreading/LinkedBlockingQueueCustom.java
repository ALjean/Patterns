package com.jean.multithreading;

import java.util.LinkedList;
import java.util.List;

public class LinkedBlockingQueueCustom<E> implements BlockingQueueCustom<E> {

    private List<E> queue;
    private int size;


    public LinkedBlockingQueueCustom(int size){
        this.size = size;
        queue = new LinkedList<>();
    }

    @Override
    public synchronized void put(E item) throws InterruptedException {
        if(size == queue.size()){
            this.wait();
        }

        queue.add(item);
        this.notifyAll();

    }

    @Override
    public E take() throws InterruptedException {
        if(queue.size() == 0){
            this.wait();
        }

        this.notifyAll();
        return queue.remove(0);


    }

    @Override
    public int size() {
        return queue.size();
    }
}
