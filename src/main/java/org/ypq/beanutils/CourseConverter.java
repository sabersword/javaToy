package org.ypq.beanutils;

import org.apache.commons.beanutils.Converter;

import java.lang.reflect.InvocationTargetException;

public class CourseConverter implements Converter {

    public <T> T convert(Class<T> type, Object value) {
        try {
            T instance = type.getConstructor(String.class, int.class).newInstance(((String) value).split(",")[0], Integer.valueOf(((String) value).split(",")[1]));
            System.out.println("课程course转换完成");
            return instance;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}
