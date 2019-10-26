package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

import java.util.List;
import java.util.Random;

public class ConcertFactory {
    private ConcertManager cm;

    public ConcertFactory(ConcertManager cm) {
        this.cm = cm;
    }

    public Concert createConcert() {
        switch (getRandomConcertType()) {
            case INDOOR:
                return new InDoorConcert(getRandomMainBand());
            case OUTDOOR:
                OutDoorConcert odc = new OutDoorConcert(getRandomMainBand());
                cm.addOutDoor(odc);
                return odc;
            case FESTIVAL:
                return new FestivalConcert(getRandomMainBand());
        }
        return null;
    }

    private ConcertType getRandomConcertType() {
        Random rm = new Random();
        ConcertType[] types = ConcertType.values();
        int randomIndex = rm.nextInt(types.length);
        return types[randomIndex];
    }

    private MainBand getRandomMainBand() {
        List<MainBand> mainBands = cm.getMainBands();
        int randomIndex = new Random().nextInt(mainBands.size());
        return mainBands.get(randomIndex);
    }

    private enum ConcertType {
        INDOOR,
        OUTDOOR,
        FESTIVAL
    }
}
