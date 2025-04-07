package com.gof.design.creational.abstractFactory.snack.burger;

import com.gof.design.creational.abstractFactory.snack.burger.Interface.Burger;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 04:59 PM
 */
public class VeggieBurger extends BaseBurger {

    @Override
    public void addIngredient() {
        System.out.println("Add Mayonnaise, Lettuce, Veggie Patty, cucumber, Tomato");
    }

    @Override
    public void setBase() {

    }

    @Override
    public void setSize() {

    }

    @Override
    public String getBase() {
        return null;
    }

    @Override
    public String getSize() {
        return null;
    }
}
