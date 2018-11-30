package com.xinyudr.proxy.delegate;

/**
 * Created by Administrator on 2018/11/29.
 */
public class Dispather implements IDelegate {
    IDelegate iDelegate;

    Dispather(IDelegate iDelegate){
        this.iDelegate=iDelegate;
    }

    //项目经理,虽然也有执行方法
    //但是他的工作职责是不一样的
    @Override
    public void doing() {
        this.iDelegate.doing();
    }
}
