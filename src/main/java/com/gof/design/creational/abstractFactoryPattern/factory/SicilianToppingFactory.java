package com.gof.design.creational.abstractFactoryPattern.factory;

import com.gof.design.creational.abstractFactoryPattern.factory.abstracts.ToppingFactory;
import com.gof.design.creational.abstractFactoryPattern.utility.Interface.CheeseUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.Interface.SauceUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.topping.MozzarellaCheeseUtility;
import com.gof.design.creational.abstractFactoryPattern.utility.topping.TomatoSauceUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 03:10 PM
 */
public class SicilianToppingFactory extends ToppingFactory {
    @Override
    public CheeseUtility createCheese(){return new MozzarellaCheeseUtility();}
    @Override
    public SauceUtility createSauce(){return new TomatoSauceUtility();}
}
