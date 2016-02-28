package com.jean.spring.lookupmethod.impl;

import com.jean.spring.lookupmethod.DemoBean;
import com.jean.spring.lookupmethod.MyHelper;

/**
 * Created by jean on 28.02.16.
 */
public abstract class AbstractLookupDemoBean implements DemoBean {

    @Override
    public abstract MyHelper getMyHelper();


    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
