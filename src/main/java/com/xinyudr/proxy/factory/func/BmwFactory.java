package com.xinyudr.proxy.factory.func;

import com.xinyudr.proxy.factory.Bmw;
import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
public class BmwFactory implements Factory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
