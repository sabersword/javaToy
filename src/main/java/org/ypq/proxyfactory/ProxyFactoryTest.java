package org.ypq.proxyfactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyFactoryTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ProxyFactory proxyFactory = new ProxyFactory(new Person());
        NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
        nameMatchMethodPointcutAdvisor.setMappedNames("code", "eod");
        MethodInterceptor methodInterceptor = new CostTimeInterceptor();
        nameMatchMethodPointcutAdvisor.setAdvice(methodInterceptor);
        proxyFactory.addAdvisor(nameMatchMethodPointcutAdvisor);
        Person person = (Person) proxyFactory.getProxy();

        Method m = Person.class.getMethod("eod", Integer.TYPE);
        m.invoke(new Person(), 11);

        person.code("intellij idea");
        person.eod(111);


    }
}
