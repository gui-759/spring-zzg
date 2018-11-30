package com.xinyudr.proxy.strategy;

import java.util.*;

/**
 * Created by Administrator on 2018/11/29.
 */
public class MyListTest {

    public static void main(String[] args) {
//        List<Long> numbers=new ArrayList<Long>();
//
//        //策略模式
//        Collections.sort(numbers, new Comparator<Long>() {
//            //返回值是固定的  0,-1,1
//            @Override
//            public int compare(Long o1, Long o2) {
//                //中间逻辑是不一样的
//                return 0;
//            }
//        });
        new MyList().sort(new Comparator() {
            @Override
            public int compareTo(Object obj1, Object obj2) {
                return 0;
            }
        });
    }
}
