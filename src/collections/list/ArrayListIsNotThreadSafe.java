package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListIsNotThreadSafe {

    public void isArrayListThreadSafe() {
        List<Integer> list = new ArrayList<>();
        //List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        //List<Integer> list = new CopyOnWriteArrayList<>();
        // Thread 1: Adds numbers to the list
        Thread t1 = new Thread(() -> {
            //synchronized (this) {
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
            //}
        });

        // Thread 2: Also adds numbers to the list
        Thread t2 = new Thread(() -> {
            //synchronized (this) {
                for (int i = 1000; i < 2000; i++) {
                    list.add(i);
                }
            //}
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print size - it may not be 2000 due to race conditions
        System.out.println("Final size of ArrayList: " + list.size());
    }

    public static void main(String[] args) {
        ArrayListIsNotThreadSafe obj = new ArrayListIsNotThreadSafe();
        obj.isArrayListThreadSafe();
    }
}
