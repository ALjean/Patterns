package com.jean.spring.lookupmethod;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Created by jean on 28.02.16.
 */
public class LookupDemo {
    public static void main(String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-contaxt-xml.xml");
        ctx.refresh();

        DemoBean standardBean = (DemoBean) ctx.getBean("standardLookupDemoBean");
        DemoBean abstractBean = (DemoBean) ctx.getBean("abstractLookupDemoBean");

        displayInfo(standardBean);
        displayInfo(abstractBean);
    }

    public static void displayInfo(DemoBean demoBean){
        MyHelper helper1 = demoBean.getMyHelper();
        MyHelper helper2 = demoBean.getMyHelper();

        System.out.println("Helper bean the same? " + (helper1 == helper2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");

        for(int i = 0; i < 10000; i++){
            MyHelper helper = demoBean.getMyHelper();
            helper.doSomethingHelpful();
        }

        stopWatch.stop();

        System.out.println("10000 gets took: " + stopWatch.getTotalTimeMillis() + " ms");

    }
}
