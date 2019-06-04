package com.poetry.service;

public class NormalPoet extends AbstractPoet {
    public String recitePoem(int input, String prefix, String[] linesOfPoems) {
        write(prefix, linesOfPoems);
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >= linesOfPoems.length - input; j--) {
            resultPoem += recite(linesOfPoems[j]);
        }
        return resultPoem;
    }

    public String recitePoemForEachDay(String prefix, String[] linesOfPoems) {
        write(prefix, linesOfPoems);
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >= 0; j--) {
            resultPoem += "Day " + (linesOfPoems.length - j) + " -\n";
            resultPoem += recitePoem(linesOfPoems.length - j, prefix, linesOfPoems);
        }
        return resultPoem;
    }
}
