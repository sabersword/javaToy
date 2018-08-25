package org.ypq.future;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadTask implements Callable<List<Integer>> {

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            list.add(random.nextInt(10));
//            Thread.sleep(100);
//            if (i == 10) {
//                throw new ExecutionException("就是想抛出异常", null);
//            }
        }
        return list;
    }
}
