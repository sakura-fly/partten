package com.gao.adapter;

/**
 * 客户端
 */
public class Client {

    public void test1(Target t) {
        t.handleReq();
    }

    // 类适配器
    // public static void main(String[] args) {
    //     Client c = new Client();
    //     Adaptee a = new Adaptee();
    //     Target t = new Adapter();
    //     c.test1(t);
    // }


    // 对象适配器
    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter2(a);
        c.test1(t);
    }


}
