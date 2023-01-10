package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void testSetCorrectStation() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);
        int actual = radio.getCurrentWave();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncorrectStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncorrectStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNext() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);
        radio.next();
        int actual = radio.getCurrentWave();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetOverLimitWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.next();
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetPrev() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);
        radio.prev();
        int actual = radio.getCurrentWave();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetUnderLimitWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prev();
        int actual = radio.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetCorrectVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int actual = radio.getCurrentVolume();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetOverLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetUnderLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncorrectVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncorrectVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}