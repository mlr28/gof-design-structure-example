package com.gof.design.structural.adapterPattern.interfaceAdapter;

import com.gof.design.structural.adapterPattern.obj.Volt;


/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:09 AM
 */

public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}