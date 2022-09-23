package com.gof.design.creational.abstractFactoryPattern_old;

import com.gof.design.creational.abstractFactoryPattern_old.factory.GourmetPizzaFactory;
import com.gof.design.creational.abstractFactoryPattern_old.factory.SicilianPizzaFactory;
import com.gof.design.creational.abstractFactoryPattern_old.utility.Interface.PizzaUtility;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 01:58 AM
 */
@SpringBootApplication
public class AbstractFactoryDesignApplication {

    public static void main(String[] args) {
        PizzaUtility gPU = new GourmetPizzaFactory().createPizza("cheese");
        // Pizza pu = PizzaFactory.createPizza("cheese");
        if (gPU != null) {
            gPU.setBase();
            gPU.setSize();
            gPU.addIngredient();
            gPU.bakePizza();
        } else System.out.println("Sorry , selected pizza is not available");

        System.out.println("-----------------------------------------------------------");
        PizzaUtility sPU = new SicilianPizzaFactory().createPizza("veggie");
        // Pizza pu = PizzaFactory.createPizza("cheese");
        if (sPU != null) {
            sPU.setBase();
            sPU.setSize();
            sPU.addIngredient();
            sPU.bakePizza();
        } else System.out.println("Sorry , selected pizza is not available");
    }
}
