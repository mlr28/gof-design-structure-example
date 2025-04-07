package com.gof.design.creational.abstractFactory.snackFactory;

import com.gof.design.creational.abstractFactory.snack.Snack;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 05:06 PM
 */
public abstract class SnackFactory {
    public static SnackFactory getSnackFactory(String factory){
        switch (factory){
            case "pizza":
                return new PizzaFactory();
            case "burger":
                return new BurgerFactory();
            default :
                return null;
        }
    }
    public abstract Snack createSnack(String type);
}
