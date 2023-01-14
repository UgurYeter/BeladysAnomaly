package com.yeter;

import java.util.List;

public class ResultPrinter {
    public static final char HIT = '✓';
    public static final char MISS = 'X';

    public void print(List<PageNumberAndCacheResult> result) {
        System.out.print("\n");
        printBorder(result);
        System.out.print("\n");
        for (PageNumberAndCacheResult entry : result) {
            System.out.print("| " + entry.pageNumber() + " | " + (entry.cacheHit() ? HIT : MISS));
            System.out.print(" |");
        }
        System.out.print("\n");
        printBorder(result);
    }

    private static void printBorder(List<PageNumberAndCacheResult> result) {
        int counter = 0;
        while (counter < result.size()) {
            counter++;
            System.out.print("---------");
        }
    }
}
