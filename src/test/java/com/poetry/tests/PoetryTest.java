package com.poetry.tests;

import com.poetry.constants.PoetryConstants;
import com.poetry.service.EchoPoet;
import com.poetry.service.NormalPoet;
import com.poetry.tests.constants.TestConstants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PoetryTest {

    @Test
    public void testWithoutEchoForDay1() {
        NormalPoet poet = new NormalPoet();
        String composedPoem = poet.recitePoem(1, PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
        assertEquals(TestConstants.TestCase.TEST_WITHOUT_ECHO_FOR_DAY_1, composedPoem);
    }

    @Test
    public void testWithEchoForDay1() {
        EchoPoet poet = new EchoPoet();
        String composedPoem = poet.reciteEchoPoem(1, PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
        assertEquals(TestConstants.TestCase.TEST_WITH_ECHO_FOR_DAY_1, composedPoem);
    }

    @Test
    public void testWithoutEchoForDay2() {
        NormalPoet poet = new NormalPoet();
        String composedPoem = poet.recitePoem(2, PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
        assertEquals(TestConstants.TestCase.TEST_WITHOUT_ECHO_FOR_DAY_2, composedPoem);
    }

    @Test
    public void testWithEchoForDay2() {
        EchoPoet poet = new EchoPoet();
        String composedPoem = poet.reciteEchoPoem(2, PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
        assertEquals(TestConstants.TestCase.TEST_WITH_ECHO_FOR_DAY_2, composedPoem);
    }

    @Test
    public void testWithReciteOnly() {
        NormalPoet poet = new NormalPoet();
        String composedPoem = poet.recitePoemForEachDay(PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
        assertEquals(TestConstants.TestCase.TEST_WITH_RECITE, composedPoem);
    }

    @Test
    public void testWithReciteAndEcho() {
        EchoPoet poet = new EchoPoet();
        String composedPoem = poet.reciteEchoPoemForEachDay(PoetryConstants.Poem.PRE_POEM, PoetryConstants.Poem.POEM_LINES_ARRAY);
        assertEquals(TestConstants.TestCase.TEST_WITH_RECITE_AND_ECHO, composedPoem);
    }
}
