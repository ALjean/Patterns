package com.jean.patterns.singleton;

public class MakeACaption {

    private static MakeACaption caption; //= new MakeACaption()  This means we use Early Init (Thread Save to)

    private MakeACaption(){

    }


    //if we add synchronized We will get thread save singleton
    public  static MakeACaption getCaption(){
        if(caption == null){
            caption = new MakeACaption();

            System.out.println("Create caption");
        } else {
            System.out.println("Caption already exist");
        }

        return caption;
    }
}
