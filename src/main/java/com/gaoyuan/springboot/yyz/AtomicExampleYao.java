package com.gaoyuan.springboot.yyz;

import com.gaoyuan.springboot.demo.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/5/31 15:56
 * @desc
 */
@Slf4j
@ThreadSafe
public class AtomicExampleYao {
    private static final int threadNum = 5000;
    private static final int semphoreNum = 50;
    private static AtomicInteger atomicLong = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(semphoreNum);
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (Exception e) {

                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        log.info("{}", atomicLong.get());

    }

    private static void add() {
        atomicLong.incrementAndGet();
    }


}
