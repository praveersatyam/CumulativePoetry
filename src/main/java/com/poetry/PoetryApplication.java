package com.poetry;

import com.poetry.service.PoemReciter;

import java.util.ArrayList;
import java.util.List;

public class PoetryApplication {
    public static void main(String[] args) {
        List<String> inputArgs = new ArrayList<>();
        for (String arg : args) {
            inputArgs.add(arg);
        }
        PoemReciter poemReciter = new PoemReciter();
        int index = inputArgs.indexOf("--reveal-for-day");
        String resultPoem = "";
        if (inputArgs.contains("--echo")) {
            resultPoem = poemReciter.reciteEchoPoem(Integer.parseInt(inputArgs.get(index)));
        } else {
            resultPoem = poemReciter.reciteEchoPoem(Integer.parseInt(inputArgs.get(index)));
        }
        System.out.println(resultPoem);
    }
}
