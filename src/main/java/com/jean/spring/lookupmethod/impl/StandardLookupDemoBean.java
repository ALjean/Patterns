package com.jean.spring.lookupmethod.impl;

import com.jean.spring.lookupmethod.DemoBean;
import com.jean.spring.lookupmethod.MyHelper;

/**
 * Created by jean on 28.02.16.
 */
public class StandardLookupDemoBean implements DemoBean {

    private MyHelper myHelper;

    public void setMyHelper(MyHelper myHelper){
        this.myHelper = myHelper;
    }

    @Override
    public MyHelper getMyHelper() {
        return myHelper;
    }

    @Override
    public void someOperation() {
        myHelper.doSomethingHelpful();
    }
}
