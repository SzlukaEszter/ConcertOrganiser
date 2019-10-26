package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

public class FestivalConcert extends Concert {

    public FestivalConcert(MainBand mainBand) {
        super(mainBand);
        capacity = 8000;
        duration = 6;
        ticketPrice = calculateTicketPrice();
        beerPrice = 1000;

    }

    @Override
    public String toString() {
        return "Festival, Style: " + style +
                "\n Artist: " + mainBand +
                "\n Warmup: " + warmUpBand +
                "\n Ticketprice: " + ticketPrice +
                "\n TicketsSold: " + ticketsSold;
    }

}
