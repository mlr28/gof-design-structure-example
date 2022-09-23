package com.gof.design.creational.abstractFactory.snack.pizza;

import com.gof.design.creational.abstractFactory.snack.pizza.Interface.Pizza;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:03 AM
 */
public class CheesePizza extends BasePizza {
    private String size;
    private String baseType;
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
