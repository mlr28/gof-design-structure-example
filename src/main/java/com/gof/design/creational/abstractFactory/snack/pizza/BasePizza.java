package com.gof.design.creational.abstractFactory.snack.pizza;

import com.gof.design.creational.abstractFactory.snack.pizza.Interface.Pizza;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:00 AM
 */
public abstract class BasePizza implements Pizza {
    @Override
    public void prepareSnack() {
        System.out.println("Bake pizza for 20 min at 400 `C");
    }

    public abstract void addIngredient();

    public abstract void setBase();

    public abstract void setSize();

    public abstract String getBase();

    public abstract String getSize();
}
