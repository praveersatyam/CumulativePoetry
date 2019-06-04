package com.poetry.service;

import com.poetry.constants.PoetryConstants;

public class Poet extends AbstractPoet{
    public String recitePoem(int input) {
        String prefix = PoetryConstants.Poem.PRE_POEM;
        String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
        String resultPoem = "";
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >= linesOfPoems.length - input; j--) {
            resultPoem += recite(linesOfPoems[j]);
        }
        return resultPoem;
    }

    public String reciteEchoPoem(int input) {
        String prefix = PoetryConstants.Poem.PRE_POEM;
        String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
        String resultPoem = "";
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >= linesOfPoems.length - input; j--) {
            resultPoem += recite(linesOfPoems[j] + linesOfPoems[j]);
        }
        return resultPoem;
    }

    public String recitePoemForEachDay(){
        String prefix = PoetryConstants.Poem.PRE_POEM;
        String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
        String resultPoem = "";
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >=0 ; j--) {
            resultPoem += "Day "+(linesOfPoems.length-j)+" -\n";
            resultPoem += recitePoem(linesOfPoems.length-j);
        }
        return resultPoem;
    }

    public String reciteEchoPoemForEachDay(){
        String prefix = PoetryConstants.Poem.PRE_POEM;
        String[] linesOfPoems = PoetryConstants.Poem.POEM_LINES_ARRAY;
        String resultPoem = "";
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >=0 ; j--) {
            resultPoem += "Day "+(linesOfPoems.length-j)+" -\n";
            resultPoem += reciteEchoPoem(linesOfPoems.length-j);
        }
        return resultPoem;
    }
}
