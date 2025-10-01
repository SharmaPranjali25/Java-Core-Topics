package com.test.pitfalls;

class Item {
    private int value;
    private boolean valSet = false;

    public synchronized void setItem(int i) {
        try {
            while (valSet) {
                wait(); // Wait until the item is consumed
            }
            value = i;
            System.out.println("Producer thread produces → " + value);
            valSet = true;
            notify(); // Notify consumer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public synchronized void getItem() {
        try {
            while (!valSet) {
                wait(); // Wait until the item is produced
            }
            System.out.println("Consumer thread consumes → " + value);
            valSet = false;
            notify(); // Notify producer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class Producer implements Runnable {
    private final Item item;
    private int i = 0;

    public Producer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000); // Simulate production time
                item.setItem(i++);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private final Item item;

    public Consumer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(500); // Simulate consumption time
                item.getItem();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

public class ITCDemo {
    public static void main(String[] args) {
        Item item = new Item();
        Thread producer = new Thread(new Producer(item));
        Thread consumer = new Thread(new Consumer(item));

        producer.start();
        consumer.start();
    }
}

