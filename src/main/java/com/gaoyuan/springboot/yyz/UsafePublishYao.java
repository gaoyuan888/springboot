package com.gaoyuan.springboot.yyz;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/5/31 16:39
 * @desc
 */
public class UsafePublishYao {

    public int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        UsafePublishYao usafePublishYa0 = new UsafePublishYao();

        System.out.println(Arrays.toString(usafePublishYa0.array));


        usafePublishYa0.array[0] = 8;
        System.out.println(Arrays.toString(usafePublishYa0.array));


    }

}
