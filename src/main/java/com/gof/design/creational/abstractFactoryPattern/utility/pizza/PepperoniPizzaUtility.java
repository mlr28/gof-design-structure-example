package com.gof.design.creational.abstractFactoryPattern.utility.pizza;

import com.gof.design.creational.abstractFactoryPattern.factory.abstracts.ToppingFactory;
import com.gof.design.creational.abstractFactoryPattern.utility.Abstract.BasePizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:03 AM
 */
public class PepperoniPizzaUtility extends BasePizzaUtility {

    private String size;
    private String baseType;

    ToppingFactory toppingFactory;
    public PepperoniPizzaUtility(ToppingFactory toppingFactory)
    {
        this.toppingFactory=toppingFactory;
    }

    @Override
    public void setBase() {
        this.baseType ="THIN_CRUST";
        System.out.println("Thin Crust Base");
    }

    @Override
    public void setSize() {
        this.size ="REGULAR";
        System.out.println("Regular Size");
    }

    @Override
    public String getBase() {
        return this.baseType;
    }

    @Override
    public String getSize() {
        return this.size;
    }
    @Override
    public void addIngredient() {
        System.out.println("Add Pepperoni and Parmesan Cheese as toppings");
    }
}
