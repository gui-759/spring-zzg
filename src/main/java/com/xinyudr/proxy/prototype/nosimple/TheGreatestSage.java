package com.xinyudr.proxy.prototype.nosimple;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/11/30.
 */
//齐天大圣
public class TheGreatestSage extends Mokey implements Cloneable ,Serializable{

    //金箍棒
    private GoldRingedStaff staff;

    public TheGreatestSage(){
        this.staff=new GoldRingedStaff();
        this.birthdat=new Date();
        this.height=150;
        this.weight=30;
    }

    //分身技能
    public Object clone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
//            return super.clone();
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            TheGreatestSage copy=(TheGreatestSage) ois.readObject();
            copy.birthdat=new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                oos.close();
                bos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void change(){
        TheGreatestSage copySage=(TheGreatestSage) clone();
        System.out.println("大圣本身生日:"+this.getBirthdat().getTime());
        System.out.println("克隆大圣生日:"+copySage.getBirthdat().getTime());
        System.out.println("本身和克隆是否为同一对象:"+(this==copySage));
        System.out.println("本身金箍棒和克隆金箍棒是否同一个对象"+(this.getStaff()==copySage.getStaff()));
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}
