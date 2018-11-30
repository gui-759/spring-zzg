package com.xinyudr.proxy.jdk;

/**
 * Created by Administrator on 2018/11/27.
 */
public class TestFindLove {
    public static void main(String[] args) {
//        new Zhangsan().findLove();
        try {
            Person obj = (Person) new MeiPo().getInstance(new Zhangsan());
            System.out.println(obj.getClass());
            obj.findLove();

            //原理：
            //1.拿到被代理对象的引用，然后获取他的接口
            //2.jdk代理重新生成一个类，同时实现给的代理对象所实现的借口
            //3.把被代理对象的引用也拿到了
            //4.重新动态生成一个class字节码
            //5.然后编译

//            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("$Proxy0.class");
//            os.write(data);
//            os.close();
//
//            Person obj = (Person) new ZMeipo().getInstance(new Zhangsan());
//            System.out.println(obj.getClass());
//            obj.findLove();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
