package com.jean.patterns.abstractfactory.impl;

import com.jean.patterns.abstractfactory.Shape;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
