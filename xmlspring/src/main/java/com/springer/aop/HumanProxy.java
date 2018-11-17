package com.springer.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HumanProxy implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("The Human say ");
        Object proceed = invocation.proceed();
        System.out.println("End.");
        return proceed;
    }
}
