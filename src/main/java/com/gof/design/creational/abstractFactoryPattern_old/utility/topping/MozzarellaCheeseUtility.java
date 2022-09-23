package com.gof.design.creational.abstractFactoryPattern_old.utility.topping;

import com.gof.design.creational.abstractFactoryPattern_old.utility.Interface.CheeseUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 03:01 PM
 */
public class MozzarellaCheeseUtility implements CheeseUtility {
    public MozzarellaCheeseUtility() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
