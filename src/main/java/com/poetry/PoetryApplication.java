package com.poetry;

import com.poetry.service.Poet;

import java.util.ArrayList;
import java.util.List;

public class PoetryApplication {
    public static void main(String[] args) {
        List<String> inputArgs = new ArrayList<>();
        for (String arg : args) {
            inputArgs.add(arg);
        }
        Poet poet = new Poet();
        String resultPoem = "";
        if(inputArgs.contains("--recite")){
            if (inputArgs.contains("--echo")) {
                resultPoem = poet.reciteEchoPoemForEachDay();
            } else {
                resultPoem = poet.recitePoemForEachDay();
            }
        }
        if(inputArgs.contains("--reveal-for-day")){
            int revealForDayIndexInArgs = inputArgs.indexOf("--reveal-for-day");
            int day = Integer.parseInt(inputArgs.get(revealForDayIndexInArgs+1));
            if (inputArgs.contains("--echo")) {
                resultPoem = poet.reciteEchoPoem(day);
            } else {
                resultPoem = poet.recitePoem(day);
            }
        }
        System.out.println(resultPoem);
    }
}
