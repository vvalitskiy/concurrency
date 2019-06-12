package com.examples.single;


class LambdaThreadExampleRunner {

    public static void main(String... args) {
        //Run thread with Runnable task
        Runnable runnableTask = () -> System.out.println("Thread #1 was started");
        new Thread(runnableTask).start();

        //Run thread with Lambda (also Runnable)
        new Thread(() -> {
            System.out.println("Thread #2 was started");
        }).start();
    }


}
