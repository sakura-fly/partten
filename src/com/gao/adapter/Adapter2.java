package com.gao.adapter;

/**
 * 适配器
 * 对象适配器，使用组合的方式与被适配对象整合
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
