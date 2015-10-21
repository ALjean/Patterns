package com.jean.patterns.proxywithreflaction;

import java.lang.reflect.Proxy;

public class Runner {
    public static void main(String ... args){
        ExampleImpl example = new ExampleImpl();

        Example proxied = (Example) Proxy.newProxyInstance(Runner.class.getClassLoader(), example.getClass().getInterfaces(), new CustomInvocationHandler(example));
        proxied.getMethod();
    }
}
