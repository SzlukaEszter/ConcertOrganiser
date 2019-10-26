package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

public class FestivalConcert extends Concert {

    public FestivalConcert(MainBand mainBand) {
        super(mainBand);
        capacity = 8000;
        duration = 6;
        ticketPrice = calculateTicketPrice();
        beerPrice = 1000;
        //todo: style =
    }

}
