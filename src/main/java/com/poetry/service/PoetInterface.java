package com.poetry.service;

public interface PoetInterface {
    public String recite();
    public void write(String prefix, String[] linesOfPoems);
    public void flush();
}
