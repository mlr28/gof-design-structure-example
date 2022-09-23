package com.gof.design.creational.abstractFactoryPattern;

import com.gof.design.creational.abstractFactoryPattern.factory.GourmetPizzaFactory;
import com.gof.design.creational.abstractFactoryPattern.factory.SicilianPizzaFactory;
import com.gof.design.creational.abstractFactoryPattern.factory.abstracts.PizzaFactory;
import com.gof.design.creational.abstractFactoryPattern.utility.Interface.PizzaUtility;
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
        // PizzaUtility pu = PizzaFactory.createPizza("cheese");
        if (gPU != null) {
            gPU.setBase();
            gPU.setSize();
            gPU.addIngredient();
            gPU.bakePizza();
        } else System.out.println("Sorry , selected pizza is not available");

        System.out.println("-----------------------------------------------------------");
        PizzaUtility sPU = new SicilianPizzaFactory().createPizza("veggie");
        // PizzaUtility pu = PizzaFactory.createPizza("cheese");
        if (sPU != null) {
            sPU.setBase();
            sPU.setSize();
            sPU.addIngredient();
            sPU.bakePizza();
        } else System.out.println("Sorry , selected pizza is not available");
    }
}
