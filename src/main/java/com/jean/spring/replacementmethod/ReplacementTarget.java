package com.jean.spring.replacementmethod;

/**
 * Created by jean on 28.02.16.
 */
public class ReplacementTarget {

    public String formatMessege(String msg){
        return "<h1>" + msg + "</h1>";
    }

    public String fromatMessege(Object msg){
        return "<h1>" + msg + "</h1>";
    }
}
