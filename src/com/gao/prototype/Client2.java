package com.gao.prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date d = new Date(23333333333L);
        System.out.println(d);
        Sheep2 s1 = new Sheep2("ss",d);
        Sheep2 s2 = (Sheep2) s1.clone();
        d.setTime(2233);
        System.out.println(s1);
        System.out.println(s2);

    }
}
