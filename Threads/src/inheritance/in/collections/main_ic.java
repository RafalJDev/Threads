package inheritance.in.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jaszczynski.Rafal on 25.11.2017.
 */
public class main_ic {

    public static void main(String[] args) {
        List< A> bList = new ArrayList<>();

        A a = new A();
        B b = new B();
        C c = new C();
        Object object = new Object();

        bList.add(a);
        bList.add(b);
        bList.add(c);
        //bList.add(object);

        List<C> cList = new ArrayList<>();

       // cList.add((C) a);
        //cList.add((C) b);
        cList.add((C) c);
        //cList.add((C) object);
        int[][] ar = new int[4][4];
        int[][][] threeDimArr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        int x = threeDimArr[1][0][0];

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"I");
        map.put(2,"ugds");
        map.put(3,"ugw");
        map.put(4,"uff");
        map.put(5,"udf");
        map.put(6,"uus");
        map.put(7,"uta");

       String cos = map.get(4);

        String cos1 = map.remove(4);

        a.printSth();
        b.printSth();
        c.printSth();

        ((A) b).printSth();

        A b1 = new B();

        b1.printSth();
    }
}
