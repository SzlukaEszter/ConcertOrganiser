package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;
import com.codecool.SzlukaEszter.bands.Style;

public abstract class Concert {
    protected MainBand mainBand;
   //TODO protected WarmUpBand warmUpBand;
    protected int capacity;
    protected double duration;
    protected int ticketPrice;
    protected int beerPrice;
    protected Style style;


    public Concert(MainBand mainBand) {
        this.mainBand = mainBand;
        style = mainBand.getStyle();
    }

    protected int getTicketPrice(){
        //TODO add random ticketPrice between 1200 and 1500
        return 1200;
    }
}
