package com.codecool.SzlukaEszter;

public class Main {

    public static void main(String[] args) {
        ConcertOrganiser organiser = new ConcertOrganiser();
        int numOfConcerts = 10;
        organiser.organise(numOfConcerts);
        System.out.println("The profit of " + numOfConcerts + " concerts: " + organiser.getProfit());

    }
}
