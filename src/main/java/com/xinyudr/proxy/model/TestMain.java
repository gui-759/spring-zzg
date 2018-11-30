package com.xinyudr.proxy.model;

import com.xinyudr.proxy.cglib.ZMeipo;

/**
 * Created by Administrator on 2018/11/28.
 */
public class TestMain {
    public static void main(String[] args) {
        //jdk的动态代理 是通过接口来进行强制转换
        //生成以后的代理对象,可以强制转换为接口

        //cglib 的动态代理是通过生成一个被代理对象的子类,然后重写父类
        //的方法
        //生成以后的对象,可以强制转换为被代理对象(也就是自己写的类)
        //子类引用赋值给父类

        try {
            //这下面的 new Zhangsan()是没什么用的
            ZhangSan instance = (ZhangSan) new ZMeipo().getInstance(ZhangSan.class);
            instance.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
