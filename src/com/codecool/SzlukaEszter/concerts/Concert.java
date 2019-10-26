package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;
import com.codecool.SzlukaEszter.bands.Style;
import com.codecool.SzlukaEszter.bands.WarmUpBand;

import java.util.Random;

public abstract class Concert {
    protected MainBand mainBand;
    protected WarmUpBand warmUpBand;
    protected int capacity;
    protected double duration;
    protected int ticketPrice;
    protected int beerPrice;
    protected Style style;


    public Concert(MainBand mainBand) {
        this.mainBand = mainBand;
        style = mainBand.getStyle();
        warmUpBand = mainBand.chooseWarmUp();
    }

    protected int calculateTicketPrice(){
        return new Random().nextInt(1500-1200+1) + 1200;
    }

    public WarmUpBand getWarmUpBand() throws NullPointerException {
        return warmUpBand;
    }

    public String toString(){
        return this.getClass() + " mainband: " + mainBand + " warmup: " + warmUpBand;
    }

    public int calculateProfit(){
        int ticketsSold = ticketsSold();
        int ticketProfit = (int)Math.round(ticketsSold * ticketPrice * 0.4);
        int beerProfit = ticketsSold * beerPrice;
        return ticketProfit + beerProfit;
    }

    protected int ticketsSold(){
        if (new Random().nextInt(100)< 80) {
            return capacity;
        }
        else {
            double randomPercent = (new Random().nextInt(80-70+1) + 70)/100;
            double ticketsSold = capacity * randomPercent;
             return (int)(Math.round(ticketsSold));
        }
    }
}
