package com.xinyudr.proxy.prototype.simple;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/11/30.
 */
public class CloneTest {
    public static void main(String[] args) {
        ConcretePrototype cp=new ConcretePrototype();
        cp.setAge(18);

        ConcretePrototype copy= (ConcretePrototype) cp.clone();
        System.out.println(copy.getAge()==cp.getAge());
        System.out.println(cp==copy);
        System.out.println(cp.equals(copy));

        //原型模式: 就是有一个现成的对象,这个对象里面有已经
        //设置好的值
        //当要新建一个对象的时候,并且要给新建的对象赋值
        //而且赋值的内容跟之前的一模一样

        //传统做法  重新new 一个 再赋值
        //若有上百个属性需要重新赋值,
        //需要用反射, 循环去赋值
        //但是性能不高
        //所以有一个克隆的方法,  克隆,字节码复制
        //克隆不走构造方法,直接copy 字节码

        //克隆做法,  如上

        //简单拷贝,克隆对象 不一样,但是里面的属性 如list 是一样的

        //克隆方法, 能够直接拷贝其实际内容的数据类型,只支持
        //9种, java的八大基本数据类型,+string

        //ORM的时候经常用到
        //ORM:ORM是通过使用描述对象和数据库之间映射的元数据，将java程序中的对象自动持久化到关系数据库中。本质上就是将数据从一种形式转换到另外一种形式。


        //什么是原型:  现有的对象就是原型
    }
}
