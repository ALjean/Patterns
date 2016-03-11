package com.jean.java.reference;

import java.lang.ref.*;
import java.util.ArrayList;
import java.util.List;

public class RefTest {

    List<BigObject> strongList;
    List<Reference<BigObject>> softList;
    List<Reference<BigObject>> weakList;
    List<Reference<BigObject>> phantomList;
    ReferenceQueue<BigObject> queue;

    /*
    this store ref on Strings, use for loading memory
    */
    List<String> loadMemoryList;

    private void printLists(){
        System.out.println("Strong references: ");
        for (BigObject bo : strongList) System.out.print(bo+" ");
        System.out.println();
        System.out.println("SoftReferences: ");
        printList(softList);
        System.out.println("WeakReferences: ");
        printList(weakList);
        System.out.println("PhantomReferences: ");
        printList(phantomList);
    }

    private void printList(List<Reference<BigObject>> pList){
        for (Reference<BigObject> ref : pList)
            System.out.print(ref.get()+" ");

        System.out.println();
    }

    private void init(){
        strongList = new ArrayList<>();
        softList = new ArrayList<>();
        weakList = new ArrayList<>();
        phantomList = new ArrayList<>();
        loadMemoryList = new ArrayList<>();
        queue = new ReferenceQueue<>();
        for (int i=0; i<3; i++){
            strongList.add(new BigObject(i));
            softList.add(new SoftReference<>(new BigObject(i)));

            weakList.add(new WeakReference<>(new BigObject(i)));
            phantomList.add(new PhantomReference<>(new BigObject(i), queue));
        }
        printLists();
    }

    private void loadMemory(){
        for (int i=0; i<1200000; i++){
            loadMemoryList.add(i+"");
        }
    }

    public void testPhantomReferences(){
        init(); //
        System.gc(); // get colector
        System.out.println("garbage collector invoked");
        printLists(); // output
    }

    public void testSoftRefences(){
        init();
        System.gc();
        System.out.println("garbage collector invoked");
        printLists();
        System.out.println("memory usage increased");
        loadMemory(); // загрузка памяти
        System.out.println("loadMemoryList.size() = "+loadMemoryList.size());
        System.gc();
        System.out.println("garbage collector invoked");
        printLists();
    }
}
