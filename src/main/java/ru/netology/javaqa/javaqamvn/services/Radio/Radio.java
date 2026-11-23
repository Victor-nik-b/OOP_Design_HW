package ru.netology.javaqa.javaqamvn.services.Radio;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
            return;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // Volume +/- в диапазоне 0...100
    public void increaseVolume(int increaseVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume(int decreaseVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // Station +/- по кругу 0...9
    public void changeStationUp(int changeStationUp) {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void changeStationDown(int changeStationDown) {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

}
