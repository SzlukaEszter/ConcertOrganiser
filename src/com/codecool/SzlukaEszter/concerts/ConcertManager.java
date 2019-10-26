package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

import java.util.List;

public interface ConcertManager {

    //used for provide access outdoors list and add outdoor concert when created
    public void addOutDoor(OutDoorConcert outdoor);

    List<MainBand> getMainBands();
}
