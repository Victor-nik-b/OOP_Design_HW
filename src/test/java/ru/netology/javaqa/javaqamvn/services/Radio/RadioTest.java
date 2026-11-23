package ru.netology.javaqa.javaqamvn.services.Radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(25);

        int expected = 25;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeUpCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeUpperLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestVolumeLowerLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestStationUpperLimit() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestStationLowerLimit() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.setCurrentStation(-1);

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(49);
        volume.increaseVolume(1);

        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseCurrentVolumeAtUpperLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume(1);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(49);
        volume.decreaseVolume(-1);

        int expected = 48;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotDecreaseCurrentVolumeAtLowerLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.changeStationUp(+1);

        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentStationToZero() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.changeStationUp(+1);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.changeStationDown(-1);

        int expected = 4;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentStationToNine() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.changeStationDown(-1);

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}
