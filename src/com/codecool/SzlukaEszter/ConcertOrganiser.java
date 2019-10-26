package com.codecool.SzlukaEszter;

import com.codecool.SzlukaEszter.bands.MainBand;
import com.codecool.SzlukaEszter.bands.WarmUpBand;
import com.codecool.SzlukaEszter.concerts.Concert;
import com.codecool.SzlukaEszter.concerts.ConcertManager;
import com.codecool.SzlukaEszter.concerts.OutDoorConcert;

import java.util.ArrayList;
import java.util.List;

public class ConcertOrganiser implements ConcertManager {
    
   private List<Concert> concerts = new ArrayList<>();
    private List<OutDoorConcert> outdoors = new ArrayList<>();
    private List<MainBand> mainBands = new ArrayList<>();
   private List<WarmUpBand> warmUpBands = new ArrayList<>();
    private int profit;


    public ConcertOrganiser() {
        initBands();
        profit = 0;
    }

    public void organise(int numOfConcerts) {
       // ConcertFactory concertFactory = new concertFactory();
        for (int i = 0; i < numOfConcerts; i++) {
            //concerts.add(concertFactory.createConcert());
        }
    }

    private void initBands(){
        //TODO IMPLEMENT
        warmUpBands.add(new WarmUpBand("Tankcsapda"));
        warmUpBands.add(new WarmUpBand("Qumby"));
        warmUpBands.add(new WarmUpBand("Colorstar"));
        warmUpBands.add(new WarmUpBand("Európa Kiadó"));
        warmUpBands.add(new WarmUpBand("Balaton"));
        warmUpBands.add(new WarmUpBand("Jazz and Swing"));

    }


    public int getProfit() {
        return profit;
    }

    @Override
    public void addOutDoor(OutDoorConcert outdoor) {
        outdoors.add(outdoor);
    }
}
