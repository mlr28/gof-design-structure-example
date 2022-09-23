package com.gof.design.creational.factoryPattern.factory;

import com.gof.design.creational.factoryPattern.utility.CheesePizzaUtility;
import com.gof.design.creational.factoryPattern.utility.Interface.PizzaUtility;
import com.gof.design.creational.factoryPattern.utility.PepperoniPizzaUtility;
import com.gof.design.creational.factoryPattern.utility.VeggiePizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:11 AM
 */
public class PizzaFactory {

    public static PizzaUtility createPizza(String type){

        switch(type){
            case "cheese" :
                return new CheesePizzaUtility();
            case "veggie" :
                return new VeggiePizzaUtility();
            case "pepperoni" :
                return new PepperoniPizzaUtility();
            default: return null;
        }
    }
}
