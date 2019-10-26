package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

public class InDoorConcert extends Concert {

    public InDoorConcert(MainBand mainBand) {
        super(mainBand);
        capacity = 3000;
        duration = 1.5;
        ticketPrice = calculateTicketPrice();
        beerPrice = 600;
    }

    @Override
    public String toString() {
        return "Indoor, Style: " + style +
                "\n Artist: " + mainBand +
                "\n Warmup: " + warmUpBand +
                "\n Ticketprice: " + ticketPrice +
                "\n TicketsSold: " + ticketsSold;
    }
}
