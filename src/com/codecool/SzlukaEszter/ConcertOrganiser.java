package com.codecool.SzlukaEszter;

import com.codecool.SzlukaEszter.bands.MainBand;
import com.codecool.SzlukaEszter.bands.Style;
import com.codecool.SzlukaEszter.bands.WarmUpBand;
import com.codecool.SzlukaEszter.bands.WarmUpPortfolio;
import com.codecool.SzlukaEszter.concerts.Concert;
import com.codecool.SzlukaEszter.concerts.ConcertFactory;
import com.codecool.SzlukaEszter.concerts.ConcertManager;
import com.codecool.SzlukaEszter.concerts.OutDoorConcert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcertOrganiser implements ConcertManager, WarmUpPortfolio {
    
   private List<Concert> concerts = new ArrayList<>();
    private List<OutDoorConcert> outdoors = new ArrayList<>();
    private List<MainBand> mainBands = new ArrayList<>();
   private List<WarmUpBand> warmUpBands = new ArrayList<>();
    private int profit;

    public List<MainBand> getMainBands() {
        return mainBands;
    }

    public ConcertOrganiser() {
        initBands();
        profit = 0;
    }

    public void organise(int numOfConcerts) {
      initConcerts(numOfConcerts);
      if (isRaining()) {
          for (OutDoorConcert outdoor : outdoors) {
              outdoor.cancel();
          }
      }
        for (Concert concert : concerts) {
            profit += concert.calculateProfit();
        }
    }

    private boolean isRaining() {
        int chance = new Random().nextInt(100);
        return chance < 30;
    }

    private void initConcerts(int numOfConcerts){
        ConcertFactory concertFactory = new ConcertFactory( this);
        for (int i = 0; i < numOfConcerts; i++) {
            concerts.add(concertFactory.createConcert());
        }

    }

    private void initBands(){

        warmUpBands.add(new WarmUpBand("Tankcsapda", Style.ROCK));
        warmUpBands.add(new WarmUpBand("Qumby", Style.ROCK));
        warmUpBands.add(new WarmUpBand("Colorstar", Style.POP));
        warmUpBands.add(new WarmUpBand("Európa Kiadó", Style.POP));
        warmUpBands.add(new WarmUpBand("Balaton", Style.POP));
        warmUpBands.add(new WarmUpBand("Jazz and Swing", Style.JAZZ));

        mainBands.add(new MainBand("Beatles", Style.POP, this::getWarmUps));
        mainBands.add(new MainBand("Qeen", Style.POP, this::getWarmUps));
        mainBands.add(new MainBand("Led Zeppelin", Style.ROCK, this::getWarmUps));
        mainBands.add(new MainBand("The Rolling Stones", Style.ROCK, this::getWarmUps));
        mainBands.add(new MainBand("Pink Floy", Style.ROCK, this::getWarmUps));
        mainBands.add(new MainBand("Metallica", Style.ROCK, this::getWarmUps));
        mainBands.add(new MainBand("Miles Davis Quintet", Style.JAZZ, this::getWarmUps));
        mainBands.add(new MainBand("Art Ensemble of Chicago", Style.JAZZ, this::getWarmUps));
        mainBands.add(new MainBand("The World Saxophone Quartet", Style.JAZZ, this::getWarmUps));
        mainBands.add(new MainBand("Duke Ellington's Jazz Orchestra", Style.JAZZ, this::getWarmUps));


    }


    public int getProfit() {
        return profit;
    }

    @Override
    public void addOutDoor (OutDoorConcert outdoor) {
        outdoors.add(outdoor);
    }

    @Override
    public List<WarmUpBand> getWarmUps() {
        return warmUpBands;
    }

    public List<Concert> getConcerts() {
        return concerts;
    }
}
