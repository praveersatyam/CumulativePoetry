package com.poetry.tests;

import com.poetry.service.PoemReciter;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PoetryTest {
    @Test
    public void testForDay1(){
        PoemReciter poemReciter = new PoemReciter();
        String output = poemReciter.recitePoem(1);
        assertEquals("This is the house that Jack built.\n\t",output);
    }
}
