package com.yeter;

import java.util.ArrayList;
import java.util.List;

public class BeladysAnomaly {
    public static final List<Integer> INPUT =
            List.of(1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5);


    public static void main(String[] args) {
        ResultPrinter resultPrinter = new ResultPrinter();
        List<PageNumberAndCacheResult> resultForSmallerCache = printMissCount(3);
        resultPrinter.print(resultForSmallerCache);
        System.out.print("\n");
        List<PageNumberAndCacheResult> resultForBiggerCache = printMissCount(4);
        resultPrinter.print(resultForBiggerCache);

    }

    private static List<PageNumberAndCacheResult> printMissCount(int size) {
        List<PageNumberAndCacheResult> result = new ArrayList<>();
        FifoPolicy fifoPolicy = new FifoPolicy(size);
        int missCount = 0;
        for (int num : INPUT) {
            boolean hit = fifoPolicy.isHit(num);
            if (!hit) {
                missCount++;
            }
            result.add(new PageNumberAndCacheResult(num, hit));
        }
        System.out.println(String.format("For size %s the missCount is %s", size, missCount));
        return result;
    }

}
