package com.gof.design.creational.abstractFactory.snackFactory;

import com.gof.design.creational.abstractFactory.snack.Snack;
import com.gof.design.creational.abstractFactory.snack.burger.AlooTikkiBurger;
import com.gof.design.creational.abstractFactory.snack.burger.ChickenBurger;
import com.gof.design.creational.abstractFactory.snack.burger.Interface.Burger;
import com.gof.design.creational.abstractFactory.snack.burger.VeggieBurger;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 04:43 PM
 */
public class BurgerFactory extends SnackFactory{
    @Override
    public  Snack createSnack(String type) {

        switch (type) {
            case "aloo":
                return new AlooTikkiBurger();
            case "veggie":
                return new VeggieBurger();
            case "chicken":
                return new ChickenBurger();
            default:
                return null;
        }
    }
}
