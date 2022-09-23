package com.gof.design.creational.abstractFactoryPattern.utility.Abstract;

import com.gof.design.creational.abstractFactoryPattern.utility.Interface.PizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:00 AM
 */
public abstract class BasePizzaUtility implements PizzaUtility {
    @Override
    public void bakePizza() {
        System.out.println("Bake pizza for 20 min at 400 `C");
    }
}
