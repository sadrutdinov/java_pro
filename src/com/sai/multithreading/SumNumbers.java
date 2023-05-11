package com.sai.multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
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

        futureResults.forEach(f -> {
            try {
                sum += f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();

        System.out.println("Total sum = " + sum);
    }

//    public static void main(String[] args) {
//        long result = 0;
//        for (long i = 1; i <= value; i++) {
//            result += i;
//        }
//
//        System.out.println(result);
//    }
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

        System.out.printf("sum from %d to %d = %d%n", from, to, localSum);

        return localSum;
    }
}
