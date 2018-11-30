package com.xinyudr.proxy.factory.simpleFactoryS;

import com.xinyudr.proxy.factory.Car;

/**
 * Created by Administrator on 2018/11/28.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Car car = new SimpleFactory().getCar("BMW");
        System.out.println(car.getName());
    }

}
