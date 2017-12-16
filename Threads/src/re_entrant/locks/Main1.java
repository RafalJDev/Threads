package re_entrant.locks;

/**
 * Created by Jaszczynski.Rafal on 02.12.2017.
 */
public class Main1 {

    public static void main(String[] args) {

        final Runner runner = new Runner();
        Runner kamil = new Runner();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runner.finished();
    }
}