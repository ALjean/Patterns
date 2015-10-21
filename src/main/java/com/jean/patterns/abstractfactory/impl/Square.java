package com.jean.patterns.abstractfactory.impl;

import com.jean.patterns.abstractfactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
