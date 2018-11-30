package com.xinyudr.proxy.factory.func;

import com.xinyudr.proxy.factory.Benz;
import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
