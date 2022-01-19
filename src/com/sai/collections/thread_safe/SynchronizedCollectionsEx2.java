package com.sai.collections.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        List<Integer> syncList = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            syncList.forEach(System.out::println);
            // если тут будет итератор, то он падает с ошибкой
        };


        Runnable runnable2 = () -> {
            syncList.remove(10);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(syncList);
    }

}

