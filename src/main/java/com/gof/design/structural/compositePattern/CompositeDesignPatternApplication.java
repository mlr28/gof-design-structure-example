package com.gof.design.structural.compositePattern;

import com.gof.design.structural.compositePattern.objType.Shape;
import com.gof.design.structural.compositePattern.objType.impl.Drawing;
import com.gof.design.structural.compositePattern.objType.obj.Circle;
import com.gof.design.structural.compositePattern.objType.obj.Triangle;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 03:58 AM
 */
@SpringBootApplication
public class CompositeDesignPatternApplication {


    @SneakyThrows
    public static void main(String[] args) {

        Shape tri = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }

}