package com.gao.prototype;

import java.util.Date;

/**
 * 原型模式
 *
 * 浅克隆
 * 属性应用指向同一个，两个sheep的birthday用的是同一个date，而不是两个一样的date
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
         Sheep s1 = new Sheep("ss",new Date(23333333333L));
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
    }

}
