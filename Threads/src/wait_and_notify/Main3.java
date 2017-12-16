package wait_and_notify;

import java.util.Scanner;

/**
 * Created by Jaszczynski.Rafal on 12.11.2017.
 */
public class Main3 {
    public static void main(String[] args) {

    }
}

class Processor {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Procuder thread running ....");
            wait();
            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return  key pressed");
            notify();
        }
    }
}
