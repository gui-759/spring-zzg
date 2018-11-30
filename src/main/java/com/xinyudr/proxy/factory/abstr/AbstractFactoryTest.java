package com.xinyudr.proxy.factory.abstr;

/**
 * Created by Administrator on 2018/11/28.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        DefaultFactory defaultFactory=new DefaultFactory();

        System.out.println(defaultFactory.getCar("BMW"));

        //抽象方法自带逻辑处理


        //spring中的工厂模式
        //生成的是 Bean
        //BeanFactory
        //单利的Bean
        //被代理的Bean
        //最原始的Bean(原型)
        //List类型的Bean
        //作用域不同的Bean

        //若采用简单工厂模式,会导致非常难维护
    }
}
