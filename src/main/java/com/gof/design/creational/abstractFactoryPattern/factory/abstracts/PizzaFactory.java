package com.gof.design.creational.abstractFactoryPattern.factory.abstracts;

import com.gof.design.creational.abstractFactoryPattern.utility.Interface.PizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:11 AM
 */
public abstract class PizzaFactory {

    public abstract PizzaUtility createPizza(String type);
}
