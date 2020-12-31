package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Random random = new Random();
    Radio radio = new Radio(random.nextInt(3) + 8);

    @Test
    void shouldRadioDefault() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void shouldPrevStation() {
        radio.setMaxStation();
        radio.setPrevStation();
        assertEquals(radio.getMaxStation() - 1, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        radio.setNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldOverNextStation() {
        radio.setMaxStation();
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUnderPrevStation() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        radio.volumeUp();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldStayVolumeUp() {
        radio.setVolume(100);
        radio.volumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        radio.volumeUp();
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldStayVolumeDown() {
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}