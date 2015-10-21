package com.jean.patterns.memento.impl;


/**
 * Created by jean on 02.05.15.
 */
public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName){
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString(){
        return this.content.toString();
    }

    public void write(String str){
        content.append(str);
    }

    public Memento save(){
        return new Memento(this.fileName, this.content);
    }

    public void untoLastSave(Object object){
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }



    private class Memento{

        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content){
            this.fileName = fileName;
            this.content = content;
        }
    }

}
