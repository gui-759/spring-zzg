package com.xinyudr.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/11/28.
 */
public class ZMeipo implements MethodInterceptor {

    //疑问?
    //好像并没有使用被代理对象的引用
    public Object getInstance(Class clazz) throws Exception{
        Enhancer enhancer=new Enhancer();
        //把父类设置为谁
        //这一步就是告诉cglib,生成的子类需要继承父类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //第一步,生成源代码
        //第二步,变异成class文件
        //第三步,加载到jvm中,并返回被代理对象
        return enhancer.create();
    }

    //同样是做了字节码重组这样一件事情
    //对于使用api的用户来说,是无感知的
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("你的性别是：");
        System.out.println("海选。。。");
        //methodProxy.invoke(o,objects);    会导致死循环
        //o 本身就是生成的子类的引用, 再用invoke调用,相当于 再次调用intercept方法

        //这个o的引用是有cglib给我们new出来的
        //cglib new 出来以后的对象,是被代理对象的子类(继承了自己写的那个类)
        //oop,在new 子类之前,实际上是默认先调用了super()方法的
        //new 了子类的同时,必须先new 出来父类,相当于是间接的持有了父类的引用
        //子类重写了父类的所有方法
        //我们改变子类对象的某些属性,是可以间接的操作到父类的属性
        methodProxy.invokeSuper(o,objects);
        System.out.println("加油");

        return null;
    }
}
