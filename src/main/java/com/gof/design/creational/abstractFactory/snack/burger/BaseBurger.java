package com.gof.design.creational.abstractFactory.snack.burger;

import com.gof.design.creational.abstractFactory.snack.burger.Interface.Burger;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 05:03 PM
 */
public abstract class BaseBurger implements Burger {
    @Override
    public void prepareSnack() {
        System.out.println("Grill burger for 4 min at 70 `C");
    }
}
