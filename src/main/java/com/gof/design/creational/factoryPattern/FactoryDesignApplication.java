package com.gof.design.creational.factoryPattern;

import com.gof.design.creational.factoryPattern.factory.PizzaFactory;
import com.gof.design.creational.factoryPattern.utility.Interface.PizzaUtility;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 01:58 AM
 */
@SpringBootApplication
public class FactoryDesignApplication {

    public static void main(String[] args) {
        // Pizza : cheese, veggie, pepperoni
        PizzaUtility pu = PizzaFactory.createPizza("cheese");
        if(pu != null)
        {
            pu.setBase();
            pu.setSize();
            pu.addIngredient();
            pu.bakePizza();
        }
        else System.out.println("Sorry , selected pizza is not available");
    }
}
