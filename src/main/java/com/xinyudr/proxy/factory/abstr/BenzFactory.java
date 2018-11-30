package com.xinyudr.proxy.factory.abstr;

import com.xinyudr.proxy.factory.Benz;
import com.xinyudr.proxy.factory.Car;
import com.xinyudr.proxy.factory.func.Factory;

/**
 * Created by Administrator on 2018/11/28.
 */
public class BenzFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
