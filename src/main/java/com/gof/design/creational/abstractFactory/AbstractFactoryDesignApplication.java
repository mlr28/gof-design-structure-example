package com.gof.design.creational.abstractFactory;

import com.gof.design.creational.abstractFactory.snack.Snack;
import com.gof.design.creational.abstractFactory.snackFactory.SnackFactory;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 01:58 AM
 */
@SpringBootApplication
public class AbstractFactoryDesignApplication {


    @SneakyThrows
    public static void main(String[] args)  {
        // Snacks : pizza, burger

        final String snackFactoryType = "pizza";
        SnackFactory snackFactory = SnackFactory.getSnackFactory(snackFactoryType);
        if (snackFactory == null)
            throw new Exception("Factory you request does not exist. I guess you need to build a new factory...");
        //Snack Type available :
        // Pizza : cheese, veggie, pepperoni
        // Burger : aloo, veggie, chicken
        Snack snack = snackFactory.createSnack("veggie");
        if (snack == null) throw new Exception("Sorry, The snack request is not available");

        if (snackFactory.getClass().getSimpleName().toLowerCase().contains("pizza")) {
            snack.setBase();
            snack.setSize();
        }
        snack.addIngredient();
        snack.prepareSnack();

    }
}
