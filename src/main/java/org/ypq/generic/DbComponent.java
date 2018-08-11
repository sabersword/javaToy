package org.ypq.generic;

import sun.rmi.runtime.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class DbComponent {

    public <T> T genericFunc(int param) {
        T result;
        if (param > 0) {
            result = (T) new BlackPerson();
        } else {
            result = (T) new Apple("red");
        }
        return result;
    }

    public <T> void printMsg(T... args){
        for(T t : args){
            System.out.println("泛型测试 t is " + t + ",t.class=" + t.getClass());
        }
    }

    public <T extends Number> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }

    public void testQuestion(List<? extends Fruit> list) {
//        list.add(new Apple("apple2"));  // 由于是? extends  所以不能修改
        System.out.println(list.get(0).getName());
    }


}
