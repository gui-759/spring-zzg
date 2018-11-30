package com.xinyudr.proxy.delegate;

/**
 * Created by Administrator on 2018/11/29.
 */
public class TargetB implements IDelegate {

    @Override
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}
