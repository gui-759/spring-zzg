package com.xinyudr.proxy.factory.simpleFactoryS;

import com.xinyudr.proxy.factory.Aodi;
import com.xinyudr.proxy.factory.Benz;
import com.xinyudr.proxy.factory.Bmw;
import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
//对于这个工厂来说
//这个工厂啥都能干
public class SimpleFactory {

    //实现统一,专业化管理
    //如果没有工厂模式, 小作坊,没有执行标准的
    //如果买到三无产品,不放心

    //简单工厂模式

    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else if("Audi".equalsIgnoreCase(name)){
            return new Aodi();
        }else{
            System.out.println("没有这个产品");
            return null;
        }
    }


}
