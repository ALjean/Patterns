package com.jean.patterns.abstractfactory.factory;

import com.jean.patterns.abstractfactory.Color;
import com.jean.patterns.abstractfactory.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);

}
