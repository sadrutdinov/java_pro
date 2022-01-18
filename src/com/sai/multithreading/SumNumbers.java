package com.sai.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static Long value = 1_000_000_000L;
    private static Long sum = 0L;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Long>> futureResults = new ArrayList<>();

        long valueDividedBy10 = value / 10;

        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);

            Future<Long> futurePartSum = executorService.submit(task);
            futureResults.add(futurePartSum);
        }

        futureResults.forEach(f-> {
            try {
                sum+=f.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();

        System.out.println("Total sum = " + sum);
    }

}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;

    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }

        String format = String.format("sum from %d to %d = %d", from, to, localSum);
        System.out.println(format);

        return localSum;
    }
}
