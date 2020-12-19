package ru.netology.radioman;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation += 1;
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation -= 1;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume += 1;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume -= 1;
    }
}
