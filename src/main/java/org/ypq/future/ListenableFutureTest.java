package org.ypq.future;

import com.google.common.util.concurrent.*;

import java.util.List;
import java.util.concurrent.Executors;

public class ListenableFutureTest {

    public static void main(String[] args) {
        ListeningExecutorService les = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
        ListenableFuture<List<Integer>> lf = les.submit(new ThreadTask());
        Futures.addCallback(lf, new FutureCallback<List<Integer>>() {
            @Override
            public void onSuccess(List<Integer> result) {
                for (Integer integer : result) {
                    System.out.println(integer + " ");
                }
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("夭寿啦,要抛出异常啦");
                t.printStackTrace();
            }
        });

    }


}
