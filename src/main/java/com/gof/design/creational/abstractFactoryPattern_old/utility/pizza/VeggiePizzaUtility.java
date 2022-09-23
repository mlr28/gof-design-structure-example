package com.gof.design.creational.abstractFactoryPattern_old.utility.pizza;

import com.gof.design.creational.abstractFactoryPattern_old.factory.abstracts.ToppingFactory;
import com.gof.design.creational.abstractFactoryPattern_old.utility.Abstract.BasePizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:03 AM
 */
public class VeggiePizzaUtility extends BasePizzaUtility {

    ToppingFactory toppingFactory;
    private String size;
    private String baseType;

    public VeggiePizzaUtility(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void setBase() {
        this.baseType = "PAN";
        System.out.println("Pan Base");
    }

    @Override
    public void setSize() {
        this.size = "LARGE";
        System.out.println("Large Size");
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
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
