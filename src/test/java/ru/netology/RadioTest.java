package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void test() {
        Radio rad = new Radio();

        //rad.currentWave = 15;

        int expected = 10;
        int actual = rad.getCurrentWave();

        assertEquals(expected,actual);
    }

}