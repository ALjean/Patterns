package com.jean.patterns.memento.impl;

/**
 * Created by jean on 02.05.15.
 */
public class FileWriterCaretaker {
    private Object object;

    public void save(FileWriterUtil fileWriterUtil){
        this.object = fileWriterUtil.save();

    }

    public void undo(FileWriterUtil fileWriter){
        fileWriter.untoLastSave(object);

    }
}
