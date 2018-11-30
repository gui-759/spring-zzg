package com.xinyudr.proxy.factory.abstr;

import com.xinyudr.proxy.factory.Aodi;
import com.xinyudr.proxy.factory.Benz;
import com.xinyudr.proxy.factory.Bmw;
import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
public abstract class AbstractFactory {

   protected abstract Car getCar();

    //属于重载
    //属于动态配置 工厂
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if("Benz".equalsIgnoreCase(name)){
            return new BenzFactory().getCar();
        }else if("Audi".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else{
            System.out.println("没有这个产品");
            return null;
        }
    }
}
