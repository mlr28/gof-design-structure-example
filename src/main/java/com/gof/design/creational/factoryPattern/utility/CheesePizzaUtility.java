package com.gof.design.creational.factoryPattern.utility;

import com.gof.design.creational.factoryPattern.utility.Abstract.BasePizzaUtility;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:03 AM
 */
public class CheesePizzaUtility extends BasePizzaUtility {

    private String size;
    private String baseType;

    @Override
    public void setBase() {
        this.baseType ="WHEAT";
        System.out.println("Wheat Base");
    }

    @Override
    public void setSize() {
        this.size ="MEDIUM";
        System.out.println("Medium Size");
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
        System.out.println("Add Mozzarella and Cheddar Cheese as toppings");
    }
}
