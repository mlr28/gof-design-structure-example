package com.gof.design.structural.adapterPattern.interfaceAdapter.impl;

import com.gof.design.structural.adapterPattern.obj.Socket;
import com.gof.design.structural.adapterPattern.interfaceAdapter.SocketAdapter;
import com.gof.design.structural.adapterPattern.obj.Volt;


/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 02:20 AM
 */

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}