package com.gof.design.creational.abstractFactoryPattern.utility.topping;

import com.gof.design.creational.abstractFactoryPattern.utility.Interface.SauceUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 03:03 PM
 */
public class TomatoSauceUtility implements SauceUtility {
        public TomatoSauceUtility(){
            prepareSauce();
        }
        @Override
        public void prepareSauce() {
            System.out.println("Preparing tomato sauce..");
        }
}
