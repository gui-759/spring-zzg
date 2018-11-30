package com.xinyudr.proxy.prototype.nosimple;

import java.util.Date;

/**
 * Created by Administrator on 2018/11/30.
 */
public class Mokey {
    //身高
    protected int height;
    //体重
    protected int weight;
    //生日
    protected Date birthdat;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthdat() {
        return birthdat;
    }

    public void setBirthdat(Date birthdat) {
        this.birthdat = birthdat;
    }
}
