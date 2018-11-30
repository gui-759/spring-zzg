package com.xinyudr.proxy.prototype.simple;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/11/30.
 */
public class Prototype implements Cloneable {

    private ArrayList list=new ArrayList();

    protected Prototype clone(){
        Prototype prototype=null;
        try{
            prototype=(Prototype)super.clone();
            prototype.list=(ArrayList)list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
