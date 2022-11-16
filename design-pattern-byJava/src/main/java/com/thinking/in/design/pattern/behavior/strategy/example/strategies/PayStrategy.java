package com.thinking.in.design.pattern.behavior.strategy.example.strategies;

/**
 * @author guyan
 */
public interface PayStrategy {
    /**
     * 支付
     *
     * @param paymentAmount
     * @return
     */
    boolean pay(int paymentAmount);

    /**
     * 支付细节
     */
    void collectPaymentDetails();
}
