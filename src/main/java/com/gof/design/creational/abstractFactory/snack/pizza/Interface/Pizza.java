package com.gof.design.creational.abstractFactory.snack.pizza.Interface;

import com.gof.design.creational.abstractFactory.snack.Snack;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 01:59 AM
 */
public interface Pizza extends Snack {
    void prepareSnack();

    void addIngredient();

    void setBase();

    void setSize();

    String getBase();

    String getSize();
}
