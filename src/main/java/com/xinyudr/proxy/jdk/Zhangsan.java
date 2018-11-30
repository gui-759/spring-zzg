package com.xinyudr.proxy.jdk;

/**
 * Created by Administrator on 2018/11/27.
 */
//张三 单身
public class Zhangsan implements Person {
    private String sex="男";
    private String name="张三";

    @Override
    public void findLove() {
        System.out.println("Mrs "+this.name+",性别："+this.sex);
        System.out.println("白富美");
        System.out.println("有房有车");
        System.out.println("身高1.55~1.6，体重90");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
