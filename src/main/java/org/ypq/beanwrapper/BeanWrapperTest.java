package org.ypq.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import java.util.Date;

public class BeanWrapperTest {

    public static void main(String[] args) throws Exception {
        Object parent = Class.forName("org.ypq.beanwrapper.Parent").newInstance();
        BeanWrapper pbw = new BeanWrapperImpl(parent);
        pbw.setPropertyValue(new PropertyValue("name", "ypq"));
        pbw.setPropertyValue("age", "10");
        pbw.registerCustomEditor(Date.class, new DatePropertyEditor());
        pbw.setPropertyValue("birthDate", "111");

        Object child = Class.forName("org.ypq.beanwrapper.Child").newInstance();
        BeanWrapper cbw = new BeanWrapperImpl(child);
        cbw.setPropertyValue("parent", parent);

        cbw.setPropertyValue("parent.age", 50);
        System.out.println(child);
    }

}
