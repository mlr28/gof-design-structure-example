package com.gof.design.creational.abstractFactoryPattern.factory.abstracts;

import com.gof.design.creational.abstractFactoryPattern.utility.Interface.CheeseUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.Interface.SauceUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 03:06 PM
 */
public abstract class ToppingFactory {
    public abstract CheeseUtility createCheese();

    public abstract SauceUtility createSauce();
}
