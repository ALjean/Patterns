package com.jean.patterns.memento.run;

import com.jean.patterns.memento.impl.FileWriterCaretaker;
import com.jean.patterns.memento.impl.FileWriterUtil;

/**
 * Created by jean on 02.05.15.
 */
public class FileWriterClient {
    public static void main(String [] args){
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of Data \n");
        System.out.println(fileWriterUtil + "\n\n");

        //save file
        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second Set of Data \n");
        System.out.println(fileWriterUtil + "\n\n");

        fileWriterCaretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil + "\n\n");
    }
}
