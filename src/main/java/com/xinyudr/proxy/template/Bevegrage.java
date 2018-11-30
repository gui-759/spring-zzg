package com.xinyudr.proxy.template;

/**
 * Created by Administrator on 2018/11/30.
 */
public abstract class Bevegrage {

    //不能被重写,固定流程
    public final void create(){
        //1.把水烧开
        boilWater();
        //2.把杯子准备好,放入原料
        pourInCup();
        //3.用水冲泡
        brew();
        //4.放入辅料
        addCoundiments();
    }

    public abstract void addCoundiments();

    public void boilWater(){
        System.out.println("烧开水,烧到100度");
    }

    public void brew(){
        System.out.println("将开水倒入杯中");
    }

    public abstract void pourInCup();
}
