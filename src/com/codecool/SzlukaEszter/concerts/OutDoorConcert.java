package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

public class OutDoorConcert extends Concert{
    private boolean cancelled;


    public OutDoorConcert(MainBand mainBand) {
        super(mainBand);
        this.cancelled = false;
        capacity = 5000;
        duration = 2;
        ticketPrice = getTicketPrice();
        //TODO style =
    }

    public void cancel(){
        cancelled = true;
    }

    public boolean isCancelled(){
        return cancelled;
    }
}
