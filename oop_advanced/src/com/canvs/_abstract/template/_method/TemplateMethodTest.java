package com.canvs._abstract.template._method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:00
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        new DrawMoney().process();
        new ManageMoney().process();
    }
}
abstract class BankTemplateMethod{
    public void takeNumber(){
        System.out.println("排队取号");
    }
    public abstract void transact();    //办理业务
    public void evaluate(){
        System.out.println("反馈评分");
    }
    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("我要取钱");
    }
}
class ManageMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要办理业务");
    }
}