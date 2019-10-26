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
    protected int ticketsSold;


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

    public int calculateProfit(){
        setTicketSold(ticketsSold());
        int ticketProfit = (int)Math.round(ticketsSold * ticketPrice * 0.4);
        int beerProfit = ticketsSold * beerPrice;
        return ticketProfit + beerProfit;
    }

    private void setTicketSold(int ticketsSold) {
        this.ticketsSold = ticketsSold();
    }

    protected int ticketsSold(){
        Random random = new Random();
        if (random.nextInt(100)< 80) {
            return capacity;
        }
        else {
            int randomPercent = random.nextInt(11) + 70;

            double ticketsSold = capacity * randomPercent /100;
             return (int)(Math.round(ticketsSold));
        }
    }
}
