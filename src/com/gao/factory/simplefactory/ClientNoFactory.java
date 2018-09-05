package com.gao.factory.simplefactory;

/**
 * 没有工厂模式
 */
public class ClientNoFactory {
    public static void main(String[] args) {
         Car ad = new Audi();
         Car byd = new Byd();


         ad.run();
         byd.run();
    }
}
