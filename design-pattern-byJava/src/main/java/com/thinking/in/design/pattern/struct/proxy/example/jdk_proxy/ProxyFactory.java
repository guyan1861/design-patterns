package com.thinking.in.design.pattern.struct.proxy.example.jdk_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public TrainTicket ticket = new TrainTicket();


    public SellTicket getProxy() {
        SellTicket proxyInstance = (SellTicket) Proxy.newProxyInstance(
                ticket.getClass().getClassLoader(),
                ticket.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理对象在卖票，赚个差价！！！！");
                    Object o = method.invoke(ticket, args);
                    return o;
                });
        return proxyInstance;
    }
}
