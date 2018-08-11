package org.ypq.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 测试反射,感觉对于输入参数含有null的,没法根据方法名和参数类型来确定
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        Class userClass = Class.forName("org.ypq.reflect.User");
        Constructor co = userClass.getConstructor(null);
        Object obj = co.newInstance(null);
        Object[] param = {new String("yanpeiquan"), new Integer(20), new Room("111")};
        Class[] paramClass = new Class[param.length];
        for (int i = 0; i < param.length; i++) {
            paramClass[i] = param[i].getClass();
        }
        Method m = userClass.getMethod("setUser", paramClass);
        m.invoke(obj, param);

        Method print = userClass.getMethod("printUser", null);
        print.invoke(obj, null);
    }

}
