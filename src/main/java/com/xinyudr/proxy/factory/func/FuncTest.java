package com.xinyudr.proxy.factory.func;

/**
 * Created by Administrator on 2018/11/28.
 */
public class FuncTest {

    public static void main(String[] args) {

        //工厂方法模式
        //各个产品的生产商,都有各自的工厂
        //生成工艺,技术都是不一样的
        Factory factory=new AudiFactory();
        System.out.println(factory.getCar());

        //需要用户关心,这个产品的生产商
        //增加的代码的使用复杂度
        factory=new BenzFactory();
        System.out.println(factory.getCar());

    }
}
