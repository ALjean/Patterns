package com.jean.patterns.abstractfactory;

import com.jean.patterns.abstractfactory.factory.AbstractFactory;
import com.jean.patterns.abstractfactory.factory.ColorFactory;
import com.jean.patterns.abstractfactory.factory.ShapeFactory;

public class FactoryProduser {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }

        if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
