package com.company;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Main.main");

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        Runnable task1 = new Runnable() {
            @Override
            public void run() {

                System.out.println("start of new thread called task1");
                try {
                    TimeUnit.SECONDS.sleep(2L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end of new thread called task1");
            }
        };

        executorService.submit(task1);
    }
}
