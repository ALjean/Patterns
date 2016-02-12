package com.jean.patterns.singleton;

public class MakeACaptionBestPractices {

    private MakeACaptionBestPractices(){}


    public  static MakeACaptionBestPractices getCaption(){
        return SingletonHelper.caption;
    }

    private static class SingletonHelper{
        private static final MakeACaptionBestPractices caption = new MakeACaptionBestPractices();
    }
}
