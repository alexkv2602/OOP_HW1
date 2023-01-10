package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void testSetCorrectStation() {
        Radio radio = new Radio();
        radio.setCurrentstation(8);
        int actual = radio.getCurrentstation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncorrectStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentstation(10);
        int actual = radio.getCurrentstation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetIncorrectStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentstation(-1);
        int actual = radio.getCurrentstation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNext() {
        Radio radio = new Radio();
        radio.setCurrentstation(6);
        radio.next();
        int actual = radio.getCurrentstation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetOverLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentstation(9);
        radio.next();
        int actual = radio.getCurrentstation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetPrev() {
        Radio radio = new Radio();
        radio.setCurrentstation(6);
        radio.prev();
        int actual = radio.getCurrentstation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetUnderLimitWave() {
        Radio radio = new Radio();
        radio.setCurrentstation(0);
        radio.prev();
        int actual = radio.getCurrentstation();
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
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
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
        radio.setCurrentVolume(101);
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
    @Test
    public void testSetMaxStation(){
        Radio radio = new Radio ( 10);

        radio.setCurrentStation (10);
        int actual = radio.getCurrentStation();
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinStation(){
        Radio radio = new Radio ( 10);

        radio.setCurrentStation (-1);
        int actual = radio.getCurrentStation();
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testZeroStation(){
        Radio radio = new Radio ( 10);

        radio.setCurrentStation (0);
        int actual = radio.getCurrentStation();
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }
}