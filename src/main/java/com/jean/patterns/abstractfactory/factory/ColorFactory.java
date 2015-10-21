package com.jean.patterns.abstractfactory.factory;


import com.jean.patterns.abstractfactory.Color;
import com.jean.patterns.abstractfactory.Shape;
import com.jean.patterns.abstractfactory.impl.Blue;
import com.jean.patterns.abstractfactory.impl.Green;
import com.jean.patterns.abstractfactory.impl.Red;

public class ColorFactory extends AbstractFactory {

    public Color getColor(String colorType) {
        if(colorType == null){ return null; }

        if(colorType.equalsIgnoreCase("RED")){return new Red();}

        if(colorType.equalsIgnoreCase("GREEN")){return new Green();}

        if(colorType.equalsIgnoreCase("BLUE")){return new Blue();}

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }


}
