package com.poetry;

import com.poetry.service.PoemReciter;

public class PoetryApplication {
    public static void main(String[] args) {
        PoemReciter poemReciter = new PoemReciter();
        String resultPoem = poemReciter.recitePoem(2);
        System.out.println(resultPoem);
    }
}
