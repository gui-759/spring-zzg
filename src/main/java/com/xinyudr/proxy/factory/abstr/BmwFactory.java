package com.xinyudr.proxy.factory.abstr;

import com.xinyudr.proxy.factory.Bmw;
import com.xinyudr.proxy.factory.Car;
import com.xinyudr.proxy.factory.func.Factory;

/**
 * Created by Administrator on 2018/11/28.
 */
public class BmwFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
