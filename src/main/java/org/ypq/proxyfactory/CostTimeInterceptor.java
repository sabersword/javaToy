package org.ypq.proxyfactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang3.time.StopWatch;

public class CostTimeInterceptor implements MethodInterceptor {


    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("观看拦截到的各种参数");
        Object[] arguments = invocation.getArguments();
        Object thisObject = invocation.getThis();
        Class returnType = invocation.getMethod().getReturnType();
        Class[] parameterTypes = invocation.getMethod().getParameterTypes();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = returnType.cast(invocation.proceed());

        stopWatch.stop();
        System.out.println("经历时间" + stopWatch.getTime());
        return result;
    }
}
