package com.gof.design.creational.abstractFactoryPattern_old.factory;

import com.gof.design.creational.abstractFactoryPattern_old.factory.abstracts.ToppingFactory;
import com.gof.design.creational.abstractFactoryPattern_old.factory.abstracts.PizzaFactory;
import com.gof.design.creational.abstractFactoryPattern_old.utility.pizza.CheesePizzaUtility;
import com.gof.design.creational.abstractFactoryPattern_old.utility.Interface.PizzaUtility;
import com.gof.design.creational.abstractFactoryPattern_old.utility.pizza.PepperoniPizzaUtility;
import com.gof.design.creational.abstractFactoryPattern_old.utility.pizza.VeggiePizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:57 PM
 */
public class SicilianPizzaFactory extends PizzaFactory {
    @Override
    public  PizzaUtility createPizza(String type){
        PizzaUtility pizza;
        ToppingFactory toppingFactory= new SicilianToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                return new CheesePizzaUtility(toppingFactory);
            case "pepperoni":
                return new PepperoniPizzaUtility(toppingFactory);
            case "veggie":
                return new VeggiePizzaUtility(toppingFactory);
            default: return null;
        }
    }
}
