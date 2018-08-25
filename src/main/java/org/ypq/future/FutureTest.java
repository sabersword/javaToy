package org.ypq.future;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> f = es.submit(new ThreadTask());
        try {
            for (Integer integer : f.get()) {
                System.out.println(integer + " ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("夭寿啦,要抛出异常啦");
            e.printStackTrace();
        }

    }
}
