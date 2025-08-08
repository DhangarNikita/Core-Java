package multithreading.class_work;

import java.util.LinkedList;

public class ProducerConsumer {
    public static void main(String[] args)
            throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 5;

        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {  //

                    if (list.size() == capacity) {
                        System.out.println("List is full, producer is waiting...");
                        notify();
                        wait();
                    }

                    list.add(value);
                    System.out.println("Producer produced-" + value);
                    value++;
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    if (list.size() == 0) {
                        System.out.println("List is empty, consumer is waiting...");
                        notify();
                        wait();
                    }
                    int val = list.removeFirst();
                    System.out.println("Consumer consumed-" + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}

