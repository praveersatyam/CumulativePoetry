package com.poetry.service;

import com.poetry.constants.PoetryConstants;

public class PoemReciter {
    public String recitePoem(int input){
        String prefix = PoetryConstants.Poem.PRE_POEM;
        String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
        String resultPoem = "";
        resultPoem+=prefix+" ";
        for (int j = linesOfPoems.length-1; j >= linesOfPoems.length-input; j--) {
            resultPoem+=linesOfPoems[j];
        }
        return resultPoem;
    }

    public String reciteEchoPoem(int input){
        String prefix = PoetryConstants.Poem.PRE_POEM;
        String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
        String resultPoem = "";
        resultPoem+=prefix+" ";
        for (int j = linesOfPoems.length-1; j >= linesOfPoems.length-input; j--) {
            resultPoem+=linesOfPoems[j];
            resultPoem+=linesOfPoems[j];
        }
        return resultPoem;
    }
}
