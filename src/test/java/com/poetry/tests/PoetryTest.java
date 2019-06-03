package com.poetry.tests;

import com.poetry.service.Poet;
import com.poetry.tests.constants.TestConstants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PoetryTest {

    @Test
    public void testWithoutEchoForDay1() {
        Poet poet = new Poet();
        String composedPoem = poet.recitePoem(1);
        assertEquals(TestConstants.TestCase.TEST_WITHOUT_ECHO_FOR_DAY_1, composedPoem);
    }

    @Test
    public void testWithEchoForDay1() {
        Poet poet = new Poet();
        String composedPoem = poet.reciteEchoPoem(1);
        assertEquals(TestConstants.TestCase.TEST_WITH_ECHO_FOR_DAY_1, composedPoem);
    }

    @Test
    public void testWithoutEchoForDay2() {
        Poet poet = new Poet();
        String composedPoem = poet.recitePoem(2);
        assertEquals(TestConstants.TestCase.TEST_WITHOUT_ECHO_FOR_DAY_2, composedPoem);
    }

    @Test
    public void testWithEchoForDay2() {
        Poet poet = new Poet();
        String composedPoem = poet.reciteEchoPoem(2);
        assertEquals(TestConstants.TestCase.TEST_WITH_ECHO_FOR_DAY_2, composedPoem);
    }

    @Test
    public void testWithRecite() {
        Poet poet = new Poet();
        String composedPoem = poet.recitePoemForEachDay();
        assertEquals(TestConstants.TestCase.TEST_WITH_RECITE, composedPoem);
    }

    @Test
    public void testWithReciteAndEcho() {
        Poet poet = new Poet();
        String composedPoem = poet.reciteEchoPoemForEachDay();
        assertEquals(TestConstants.TestCase.TEST_WITH_RECITE_AND_ECHO, composedPoem);
    }
}
