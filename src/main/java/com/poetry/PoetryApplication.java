package com.poetry;

import com.poetry.constants.PoetryConstants;
import com.poetry.service.EchoPoet;
import com.poetry.service.NormalPoet;

import java.util.ArrayList;
import java.util.List;

public class PoetryApplication {
    public static void main(String[] args) {
        List<String> inputArgs = new ArrayList<>();
        for (String arg : args) {
            inputArgs.add(arg);
        }
        String resultPoem = "";
        if(inputArgs.contains("--recite")){
            if (inputArgs.contains("--echo")) {
                EchoPoet poet = new EchoPoet();
                resultPoem = poet.reciteEchoPoemForEachDay(PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
            } else {
                NormalPoet poet = new NormalPoet();
                resultPoem = poet.recitePoemForEachDay(PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
            }
        }
        if(inputArgs.contains("--reveal-for-day")){
            int revealForDayIndexInArgs = inputArgs.indexOf("--reveal-for-day");
            int day = Integer.parseInt(inputArgs.get(revealForDayIndexInArgs+1));
            if (inputArgs.contains("--echo")) {
                EchoPoet poet = new EchoPoet();
                resultPoem = poet.reciteEchoPoem(day, PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
            } else {
                NormalPoet poet = new NormalPoet();
                resultPoem = poet.recitePoem(day, PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
            }
        }
        System.out.println(resultPoem);
    }
}
