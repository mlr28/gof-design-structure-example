package com.gof.design.creational.abstractFactory.snackFactory;

import com.gof.design.creational.abstractFactory.snack.Snack;
import com.gof.design.creational.abstractFactory.snack.pizza.CheesePizza;
import com.gof.design.creational.abstractFactory.snack.pizza.Interface.Pizza;
import com.gof.design.creational.abstractFactory.snack.pizza.PepperoniPizza;
import com.gof.design.creational.abstractFactory.snack.pizza.VeggiePizza;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:11 AM
 */
public class PizzaFactory extends SnackFactory{

    public Snack createSnack(String type){

        switch(type){
            case "cheese" :
                return new CheesePizza();
            case "veggie" :
                return new VeggiePizza();
            case "pepperoni" :
                return new PepperoniPizza();
            default: return null;
        }
    }
}
