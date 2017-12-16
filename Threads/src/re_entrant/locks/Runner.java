package re_entrant.locks;

/**
 * Created by Jaszczynski.Rafal on 02.12.2017.
 */
public class Runner {

    private int count = 0;

    private void increment() {
        for (int i=0; i<10000; i++) {
            count++;
        }
    }


    public void firstThread() {

    }

    public void secondThread() {

    }

    public void  finished() {

    }
}
