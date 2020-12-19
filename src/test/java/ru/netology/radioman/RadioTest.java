package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.setNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldOverNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUnderPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.volumeUp();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldStayVolumeUp() {
        Radio radio = new Radio();
        for (int i = 0; i < 10; i++) {
            radio.volumeUp();
        }
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.volumeUp();
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldStayVolumeDown() {
        Radio radio = new Radio();
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}