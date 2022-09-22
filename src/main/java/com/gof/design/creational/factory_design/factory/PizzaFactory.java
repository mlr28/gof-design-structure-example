package com.gof.design.creational.factory_design.factory;

import com.gof.design.creational.factory_design.utility.CheesePizzaUtility;
import com.gof.design.creational.factory_design.utility.Interface.PizzaUtility;
import com.gof.design.creational.factory_design.utility.PepperoniPizzaUtility;
import com.gof.design.creational.factory_design.utility.VeggiePizzaUtility;

import java.security.Permission;

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
