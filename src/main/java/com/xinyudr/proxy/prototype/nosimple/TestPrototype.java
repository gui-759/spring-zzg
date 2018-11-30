package com.xinyudr.proxy.prototype.nosimple;

/**
 * Created by Administrator on 2018/11/30.
 */
public class TestPrototype {
    public static void main(String[] args) {
        TheGreatestSage sage=new TheGreatestSage();
        sage.change();

        //结果
//        大圣本身生日:1543556979560
//        克隆大圣生日:1543556979560
//        本身和克隆是否为同一对象:false
//        本身金箍棒和克隆金箍棒是否同一个对象true

        //生日和金箍棒对象一样,  不是想要的结果  需要重写clone
        //重写clone, 序列化,反序列化  , 通过字节复制产生对象
        //只有实现Serializable 序列化接口才能做序列化处理

        //克隆不走构造方法, 本例子中,Date 生日本身对象
        // 初始化在构造方法中,故在序列化的时候不被复制

        //克隆不走构造方法,复制字节码
//        大圣本身生日:1543557894454
//        克隆大圣生日:1543557894588
//        本身和克隆是否为同一对象:false
//        本身金箍棒和克隆金箍棒是否同一个对象false
    }
}
