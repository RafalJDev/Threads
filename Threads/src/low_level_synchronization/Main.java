package low_level_synchronization;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Jaszczynski.Rafal on 17.11.2017.
 */
public class Main {
    public static void main(String[] args) {

    }
}

class Processor {

    private LinkedList<Integer> list = new LinkedList<>();
    private final  int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {

        int value =0;

        while (true){
            synchronized (lock){
                while (list.size()== LIMIT) {
                 lock.wait();
                }

                list.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException{

        Random random = new Random();

        while (true) {

            synchronized (lock){

                while (list.size()==0) {
                    lock.wait();
                }
                System.out.println("List size is: " + list.size());
                int value = list.removeFirst();
                System.out.println("; Value is: " + value);
                lock.notify();
            }

            Thread.sleep(random.nextInt(1000));
        }

    }
}
