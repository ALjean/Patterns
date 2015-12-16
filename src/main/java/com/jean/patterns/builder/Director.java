package com.jean.patterns.builder;

public class Director {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComuter(){
        return computerBuilder.getComputer();
    }

    public void constructComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();
        computerBuilder.buildSystemBlock();
    }
}
