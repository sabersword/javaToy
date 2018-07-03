import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("maxMemory=" + runtime.maxMemory() / 1024.0 / 1024 + "M");
        System.out.println("totalMemory=" + runtime.totalMemory() / 1024.0 / 1024 + "M");
        Random random = new Random();
        String str = new String("abc");
        List<String> stringList = new LinkedList<String>();

        for(long i = 0; ;i++) {
//            System.out.println("i=" + i + ",str.length=" + str.length());
            stringList.add(str += String.valueOf(random.nextInt(9999999)));
//            str.intern();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
