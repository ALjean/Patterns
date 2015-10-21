package com.jean.patterns.abstractfactory.run;

import com.jean.patterns.abstractfactory.Color;
import com.jean.patterns.abstractfactory.FactoryProduser;
import com.jean.patterns.abstractfactory.factory.AbstractFactory;

public class PatternDemo {

    public static void main(String ... args){
        AbstractFactory factory = FactoryProduser.getFactory("COLOR");
        Color color = factory.getColor("RED");

        if(color != null){
            color.fill();
        }

    }
}
