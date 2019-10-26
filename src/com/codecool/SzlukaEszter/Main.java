package com.codecool.SzlukaEszter;

import com.codecool.SzlukaEszter.bands.Band;
import com.codecool.SzlukaEszter.bands.MainBand;
import com.codecool.SzlukaEszter.concerts.Concert;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ConcertOrganiser organiser = new ConcertOrganiser();
        int numOfConcerts = 10;
        organiser.organise(numOfConcerts);
        System.out.println("The profit of " + numOfConcerts + " concerts: " + organiser.getProfit());
    }
}
