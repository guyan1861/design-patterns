package com.thinking.in.design.pattern.struct.proxy.example.jdk_proxy;

public interface SellTicket {
    default public void sell() {
        System.out.println("火车站在卖票！！！");
    }
}
