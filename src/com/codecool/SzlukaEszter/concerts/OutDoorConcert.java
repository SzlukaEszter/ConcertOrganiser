package com.codecool.SzlukaEszter.concerts;

import com.codecool.SzlukaEszter.bands.MainBand;

public class OutDoorConcert extends Concert{
    private boolean cancelled;


    public OutDoorConcert(MainBand mainBand) {
        super(mainBand);
        this.cancelled = false;
        capacity = 5000;
        duration = 2;
        ticketPrice = calculateTicketPrice();
        beerPrice = 800;
    }

    public void cancel(){
        cancelled = true;
    }

    public boolean isCancelled(){
        return cancelled;
    }

    @Override
    public int calculateProfit(){
        if (!isCancelled()) {return super.calculateProfit();}
        else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "OutDoor, Style: " + style +
                "\n Artist: " + mainBand +
                "\n Warmup: " + warmUpBand +
                "\n Ticketprice: " + ticketPrice +
                "\n TicketsSold: " + ticketsSold +
                "\n Cancelled: " + cancelled;

    }
}
