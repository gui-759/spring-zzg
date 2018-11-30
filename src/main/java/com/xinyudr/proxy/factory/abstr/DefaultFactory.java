package com.xinyudr.proxy.factory.abstr;

import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
public class DefaultFactory extends AbstractFactory {

    private AudiFactory factory=new AudiFactory();
    @Override
    protected Car getCar() {
        return factory.getCar();
    }
}
