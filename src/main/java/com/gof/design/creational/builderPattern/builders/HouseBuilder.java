package com.gof.design.creational.builderPattern.builders;

import com.gof.design.creational.builderPattern.product.House;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}