package com.jean.patterns.abstractfactory.factory;

import com.jean.patterns.abstractfactory.Color;
import com.jean.patterns.abstractfactory.Shape;
import com.jean.patterns.abstractfactory.impl.Circle;
import com.jean.patterns.abstractfactory.impl.Rectangle;
import com.jean.patterns.abstractfactory.impl.Square;

public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){ return null; }

        if(shapeType.equalsIgnoreCase("CIRCLE")){return new Circle();}

        if(shapeType.equalsIgnoreCase("SQUARE")){return new Square();}

        if(shapeType.equalsIgnoreCase("RECTANGLE")){return new Rectangle();}

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
