package executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Procesor implements Runnable {

    private int id;

    public Procesor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Startring: " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed: " + id);
    }
}

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0; i<5; i++){
            executorService.submit(new Procesor(i));
        }

        executorService.shutdown();

        System.out.println("All tasks submitted.");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All task completed");
    }
}
