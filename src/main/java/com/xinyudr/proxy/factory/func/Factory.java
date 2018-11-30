package com.xinyudr.proxy.factory.func;

import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
//工厂接口, 就定义了所有工厂的执行标准
public interface Factory {

    //符合汽车上路标准
    //尾气排放,电子设备安全系数...等
    Car getCar();
}
