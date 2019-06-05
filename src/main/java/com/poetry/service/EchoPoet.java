package com.poetry.service;

public class EchoPoet extends Poet {
    public String reciteEchoPoem(int input, String prefix, String[] linesOfPoems) {
        write(prefix, linesOfPoems);
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >= linesOfPoems.length - input; j--) {
            resultPoem += recite(linesOfPoems[j] + linesOfPoems[j]);
        }
        return resultPoem;
    }

    public String reciteEchoPoemForEachDay(String prefix, String[] linesOfPoems) {
        write(prefix, linesOfPoems);
        resultPoem += prefix + " ";
        for (int j = linesOfPoems.length - 1; j >= 0; j--) {
            resultPoem += "Day " + (linesOfPoems.length - j) + " -\n";
            resultPoem += reciteEchoPoem(linesOfPoems.length - j, prefix, linesOfPoems);
        }
        return resultPoem;
    }
}
