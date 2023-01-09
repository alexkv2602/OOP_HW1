package ru.netology;

public class Radio {
    private int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }
    public void increaseWave() {
        if (currentWave < 10) {
            currentVolume = currentVolume + 1;
        }
    }


    public void setCurrentWave(int newCurrentWave){
        currentWave = newCurrentWave;
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public int setCurrentVolume;

}
