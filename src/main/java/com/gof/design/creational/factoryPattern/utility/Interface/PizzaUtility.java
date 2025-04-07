package com.gof.design.creational.factoryPattern.utility.Interface;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 01:59 AM
 */
public interface PizzaUtility {
    void bakePizza();

    void addIngredient();

    void setBase();

    void setSize();

    String getBase();

    String getSize();
}
