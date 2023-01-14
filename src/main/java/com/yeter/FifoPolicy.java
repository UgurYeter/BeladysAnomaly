package com.yeter;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FifoPolicy {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int size;
    private final Set<Integer> inMemory = new HashSet<>();

    public FifoPolicy(int size) {
        this.size = size;
    }

    private void add(int num) {
        queue.add(num);
        this.inMemory.add(num);
        if (this.queue.size() > this.size) {
            Integer evicted = queue.poll();
            this.inMemory.remove(evicted);
        }
    }

    public boolean isHit(int num) {
        boolean contains = inMemory.contains(num);
        if(!contains) {
            this.add(num);
        }
        return contains;
    }
}
