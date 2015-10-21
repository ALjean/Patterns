package com.jean.patterns.abstractfactory.impl;

import com.jean.patterns.abstractfactory.Shape;

public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
