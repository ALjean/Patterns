package com.jean.patterns.iterator;

import com.jean.patterns.iterator.impl.NameRepository;

/**
 * Created by jean on 24.01.16.
 */
public class IteratorPatternDemo {
    public static void main(String... args){
        Container nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name: " + name);

        }
    }
}
