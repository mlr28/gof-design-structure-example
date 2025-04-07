package com.gof.design.creational.abstractFactory.snack;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 05:25 PM
 */
public interface Snack {
    void prepareSnack();

    void addIngredient();

    void setBase();

    void setSize();

    String getBase();

    String getSize();
}
