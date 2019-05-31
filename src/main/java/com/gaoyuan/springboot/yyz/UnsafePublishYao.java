package com.gaoyuan.springboot.yyz;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/5/31 16:39
 * @desc
 */
public class UnsafePublishYao {

    public int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        UnsafePublishYao usafePublishYa0 = new UnsafePublishYao();

        System.out.println(Arrays.toString(usafePublishYa0.array));


        usafePublishYa0.array[0] = 8;
        System.out.println(Arrays.toString(usafePublishYa0.array));


    }

}
