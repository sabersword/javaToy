package org.ypq.generic;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) throws Exception {
        Person f = new DbComponent().genericFunc(0);
        System.out.println(f);


        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);
        System.out.println("泛型测试key is " + generic.getKey());
        System.out.println("泛型测试key is " + generic1.getKey());
        System.out.println("泛型测试key is " + generic2.getKey());
        System.out.println("泛型测试key is " + generic3.getKey());


        List list = new ArrayList();
        list.add("a");
        list.add(1);
        for(Object o : list) {
            System.out.println(o);
        }

        new DbComponent().printMsg("111",222,"aaaa","2323.4",55.55);

        DbComponent dbComponent = new DbComponent();
//        dbComponent.showKeyName(generic);
//        dbComponent.showKeyName(generic1);
//        dbComponent.showKeyName(generic2);
//        dbComponent.showKeyName(generic3);


        List l = new ArrayList();
        l.add(new Apple("apple"));
        dbComponent.testQuestion(l);

    }


}
