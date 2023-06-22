package com.canvs._enum;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 11:52
 */
public class PayTest {
    public static void main(String[] args) {
        System.out.println(Pay.ALIPAY);
    }
}

class Pay{
    private final String PAY_NAME;
    private final String PAY_DESC;

    private Pay(String PAY_NAME,String PAY_DESC) {
        this.PAY_NAME = PAY_NAME;
        this.PAY_DESC = PAY_DESC;
    }
    public static final Pay WECHAT = new Pay("WECHAT","微信支付");
    public static final Pay ALIPAY = new Pay("ALIPAY","支付宝支付");
    public static final Pay BANK_CARD = new Pay("BANK_CARD","银行卡支付");
    public static final Pay CREDIT_CARD = new Pay("CREDIT_CARD","信用卡支付");
    @Override
    public String toString() {
        return "Pay{" +
                "PAY_NAME='" + PAY_NAME + '\'' +
                ", PAY_DESC='" + PAY_DESC + '\'' +
                '}';
    }
}