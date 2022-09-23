package com.gof.design.creational.abstractFactoryPattern_old.factory;

import com.gof.design.creational.abstractFactoryPattern_old.factory.abstracts.ToppingFactory;
import com.gof.design.creational.abstractFactoryPattern_old.utility.Interface.CheeseUtility;
import com.gof.design.creational.abstractFactoryPattern_old.utility.Interface.SauceUtility;
import com.gof.design.creational.abstractFactoryPattern_old.utility.topping.MozzarellaCheeseUtility;
import com.gof.design.creational.abstractFactoryPattern_old.utility.topping.TomatoSauceUtility;

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
