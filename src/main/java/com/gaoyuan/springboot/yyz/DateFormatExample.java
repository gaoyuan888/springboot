package com.gaoyuan.springboot.yyz;


import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
public class DateFormatExample {

    private final static int threadNum = 5000;
    private final static int semnum = 202;
    private static SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyyMMdd");

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(semnum);
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    update();
                    semaphore.release();
                } catch (Exception e) {

                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
    }

    private static void update() {
        try {

            dateTimeFormatter.parse("20180202");
        } catch (Exception e) {
            log.error("parse exception", e);
        }
    }

}
