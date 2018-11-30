package com.xinyudr.proxy.delegate;

/**
 * Created by Administrator on 2018/11/29.
 */
public class DisttherTest {


    public static void main(String[] args) {
        Dispather dispather=new Dispather(new TargetA());
        //看上去好像是项目经理在干活,
        //实际上干活的是普通员工
        dispather.doing();
    }
}
