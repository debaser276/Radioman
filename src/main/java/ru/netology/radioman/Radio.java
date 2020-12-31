package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
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

    public void setMaxStation() {
        currentStation = maxStation;
    }

    public void setVolume(int volume) {
        this.currentVolume = volume;
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
