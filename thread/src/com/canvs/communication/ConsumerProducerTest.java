package com.canvs.communication;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 19:12
 */
public class ConsumerProducerTest {
    public static void main(String[] args) {
        Check check = new Check();
        Producer producer = new Producer(check);
        Consumer consumer = new Consumer(check);
        producer.setName("生产者");
        consumer.setName("消费者");
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    Check check;

    public Producer(Check check) {
        this.check = check;
    }

    public Producer() {
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            check.addProduct();
        }
    }
}

class Consumer extends Thread {
    Check check;

    public Consumer() {
    }

    public Consumer(Check check) {
        this.check = check;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            check.minusProduct();
        }
    }
}

class Check {
    private int productNum = 0;
    private static final int MAX_PRODUCT = 20;
    private static final int MIN_PRODUCT = 1;

    public synchronized void addProduct() {
        if (productNum < MAX_PRODUCT) {
            System.out.println(Thread.currentThread().getName() + ":" + ++productNum);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void minusProduct() {
        if (productNum >= MIN_PRODUCT) {
            System.out.println(Thread.currentThread().getName() + ":" + --productNum);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}