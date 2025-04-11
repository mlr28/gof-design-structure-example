package com.gof.design.structural.compositePattern.objType.obj;

import com.gof.design.structural.compositePattern.objType.Shape;

public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }

}