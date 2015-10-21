package com.jean.patterns.proxywithreflaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private Object target;

    public CustomInvocationHandler(Object target){
        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long a = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        System.out.println("Total time taken " + (System.currentTimeMillis() - a));
        return result;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "CustomInvocationHandler{" +
                "target=" + target +
                '}';
    }
}
