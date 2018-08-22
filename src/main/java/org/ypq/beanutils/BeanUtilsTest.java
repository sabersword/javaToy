package org.ypq.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BeanUtilsTest {

    public static void main(String[] args) {

        Student student = new Student();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("age", 11);
        properties.put("name", "ypq");
        properties.put("birth", new Date());
        ConvertUtils.register(new CourseConverter(), Course.class);
        properties.put("course", "wuxuezhong,20");

        try {
            BeanUtils.populate(student, properties);
            // fasf
            Map<String, String> describes = BeanUtils.describe(student);
            System.out.println("测试完成");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
