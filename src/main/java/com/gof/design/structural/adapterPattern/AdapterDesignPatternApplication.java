package com.gof.design.structural.adapterPattern;

import com.gof.design.structural.adapterPattern.interfaceAdapter.SocketAdapter;
import com.gof.design.structural.adapterPattern.interfaceAdapter.impl.SocketClassAdapterImpl;
import com.gof.design.structural.adapterPattern.interfaceAdapter.impl.SocketObjectAdapterImpl;
import com.gof.design.structural.adapterPattern.obj.Volt;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ? @projectName gof-design-structure-example
 * ? @author Rohit M Lakshmikanth
 * ? @createdOn  September 23,2022 at 01:58 AM
 */
@SpringBootApplication
public class AdapterDesignPatternApplication {


    @SneakyThrows
    public static void main(String[] args) {

        callSocketClassAdapter();
        callSocketObjectAdapter();
    }

    private static void callSocketObjectAdapter() {
        System.out.println("Call from callSocketObjectAdapter()");
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Object Adapter="+v3.getVolts());
        System.out.println("v12 volts using Object Adapter="+v12.getVolts());
        System.out.println("v120 volts using Object Adapter="+v120.getVolts());
        System.out.println("------------------------------------");
    }

    private static void callSocketClassAdapter() {
        System.out.println("Call from callSocketClassAdapter()");
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
        System.out.println("------------------------------------");
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i){
            case 3: return sockAdapter.get3Volt();
            case 12: return sockAdapter.get12Volt();
            case 120: return sockAdapter.get120Volt();
            default: return sockAdapter.get120Volt();
        }
    }
}