package com.xinyudr.proxy.template;

/**
 * Created by Administrator on 2018/11/30.
 */
public class Coffee extends Bevegrage {

    //放辅料
    public void addCoundiments() {
        System.out.println("添加牛奶和糖");
    }

    //放原料
    public void pourInCup() {
        System.out.println("将咖啡放入杯中");
    }
}
