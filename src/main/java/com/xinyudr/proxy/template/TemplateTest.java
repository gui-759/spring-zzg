package com.xinyudr.proxy.template;

/**
 * Created by Administrator on 2018/11/30.
 */
public class TemplateTest {
    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        coffee.create();

        Tea tea=new Tea();
        tea.create();


        //springjdbc  模板模式
        //是java规范, 各个数据库厂商自己去实现
        //1.加载驱动类  DriverManager
        //2.建立连接
        //3.创建语句集(标准语句集,预处理语句集)(不确定语句集.不同)
        //4.执行语句集
        //5.结果集
        //ORM()
    }
}
