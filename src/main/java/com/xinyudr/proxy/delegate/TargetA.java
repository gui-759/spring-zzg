package com.xinyudr.proxy.delegate;

/**
 * Created by Administrator on 2018/11/29.
 */
//只是一种想法, 用代码描述这种想法
//所以写的比较简单
public class TargetA implements IDelegate{

    @Override
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}
