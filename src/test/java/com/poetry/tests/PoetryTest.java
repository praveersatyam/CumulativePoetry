package com.poetry.tests;

import com.poetry.service.Poet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PoetryTest {
    @Test
    public void testForDay1(){
        Poet poet = new Poet();
        String output = poet.recitePoem(1);
        assertEquals("This is the house that Jack built.\n\t",output);
    }
}
