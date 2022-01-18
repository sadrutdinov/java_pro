package com.sai.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Factorial2 factorial2 = new Factorial2(6);

        Future<Integer> future = executorService.submit(factorial2);

        try {
            factorialResult = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        System.out.println(factorialResult);



    }
}


class Factorial2 implements Callable<Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {

        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        } else {
            int result = 1;

            for (int i = 1; i <= f; i++) {
                result *= i;
            }

            return result;
        }
    }
}