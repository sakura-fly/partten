package com.gao.adapter;

/**
 * 适配器
 * 类适配器
 */
public class Adapter extends Adaptee implements Target{



    @Override
    public void handleReq() {
        super.request();
    }
}
