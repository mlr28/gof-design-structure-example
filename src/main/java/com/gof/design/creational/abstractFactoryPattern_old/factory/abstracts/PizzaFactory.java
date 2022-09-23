package com.gof.design.creational.abstractFactoryPattern_old.factory.abstracts;

import com.gof.design.creational.abstractFactoryPattern_old.utility.Interface.PizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:11 AM
 */
public abstract class PizzaFactory {

    public abstract PizzaUtility createPizza(String type);
}
