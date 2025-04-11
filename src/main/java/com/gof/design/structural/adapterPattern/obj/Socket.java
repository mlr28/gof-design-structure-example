package com.gof.design.structural.adapterPattern.obj;


/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:03 AM
 */

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}