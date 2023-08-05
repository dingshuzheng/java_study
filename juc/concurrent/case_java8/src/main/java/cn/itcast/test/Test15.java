package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test15")
public class Test15 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
            }
            log.debug("结束");
        }, "t1");
        t1.setDaemon(true); // 设置 t1 为守护线程，只要非守护线程都结束了，守护线程就会立马结束。
        t1.start();

        Thread.sleep(1000);
        log.debug("结束");
    }
}
