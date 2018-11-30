package com.xinyudr.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/11/27.
 */
public class MeiPo implements InvocationHandler {

    private Person target;

    //获取被代理人的个人资料
    public Object getInstance(Person target) throws Exception{
        this.target=target;
        Class clazz=target.getClass();
        System.out.println(clazz);
        //会自动执行invoke的方法
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你的性别是："+this.target.getSex());
        System.out.println("海选。。。");
        this.target.findLove();
        System.out.println("加油");
        return null;
    }
}
