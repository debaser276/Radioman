package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextStation() {
        currentStation += 1;
        if (currentStation == 10) {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        currentStation -= 1;
        if (currentStation == -1) {
            currentStation = 9;
        }
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void volumeUp() {
        if (currentVolume == 10) {
            return;
        }
        currentVolume += 1;
    }

    public void volumeDown() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume -= 1;
    }
}
