package com.gof.design.creational.builderPattern.director;

import com.gof.design.creational.builderPattern.builders.HouseBuilder;
import com.gof.design.creational.builderPattern.builders.impl.ConcreteHouseBuilder;
import com.gof.design.creational.builderPattern.builders.impl.PrefabricatedHouseBuilder;
import com.gof.design.creational.builderPattern.product.House;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstructionEngineerTest {
    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }
}