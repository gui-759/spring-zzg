package com.xinyudr.proxy.prototype.nosimple;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/11/30.
 */
public class GoldRingedStaff implements Serializable {

    private float height=100;

    private float diameter=10;  //直径

    public void grow(){
        this.diameter*=2;
        this.height*=2;
    }

    public void shrink(){
        this.diameter/=2;
        this.height/=2;
    }
}
