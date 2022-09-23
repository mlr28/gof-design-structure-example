package com.gof.design.creational.abstractFactoryPattern.factory;

import com.gof.design.creational.abstractFactoryPattern.factory.abstracts.ToppingFactory;
import com.gof.design.creational.abstractFactoryPattern.utility.topping.CaliforniaOilSauceUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.topping.GoatCheeseUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.Interface.CheeseUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.Interface.SauceUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 03:11 PM
 */
public class GourmetToppingFactory extends ToppingFactory {
    @Override
    public CheeseUtility createCheese(){return new GoatCheeseUtility();}
    @Override
    public SauceUtility createSauce(){return new CaliforniaOilSauceUtility();}
}
