package com.jean.patterns.abstractfactory.impl;

import com.jean.patterns.abstractfactory.Color;

public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Color Red");
    }
}
