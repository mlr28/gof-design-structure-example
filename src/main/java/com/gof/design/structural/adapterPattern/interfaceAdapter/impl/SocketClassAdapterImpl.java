package com.gof.design.structural.adapterPattern.interfaceAdapter.impl;

import com.gof.design.structural.adapterPattern.obj.Socket;
import com.gof.design.structural.adapterPattern.interfaceAdapter.SocketAdapter;
import com.gof.design.structural.adapterPattern.obj.Volt;


/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:29 AM
 */

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}