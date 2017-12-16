package countdown_latches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Jaszczynski.Rafal on 12.11.2017.
 */
public class Main1 {
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<3;i++) {
            executorService.submit(new Processor1(latch));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");
    }
}

class Processor1 implements Runnable {

    private CountDownLatch latch;

    public Processor1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        latch.countDown();
    }
}
