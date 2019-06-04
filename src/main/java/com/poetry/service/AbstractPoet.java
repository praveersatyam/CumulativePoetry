package com.poetry.service;

import com.poetry.constants.PoetryConstants;

public abstract class AbstractPoet {

    String prefix = PoetryConstants.Poem.PRE_POEM;
    String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
    String resultPoem = "";

    public String recite(String lineOfPoem){
        return lineOfPoem;
    }

    public void write(String prefix, String[] linesOfPoems){
        this.prefix = prefix;
        this.linesOfPoems = linesOfPoems;
        resultPoem = "";
    }

    public void flush(){
        prefix = "";
        linesOfPoems = null;
        resultPoem = "";
    }
}
