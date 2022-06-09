package com.thinking.in.design.pattern.struct.proxy.example.jdk_proxy;

public class Demo {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket proxy = proxyFactory.getProxy();
        proxy.sell();
    }
}
