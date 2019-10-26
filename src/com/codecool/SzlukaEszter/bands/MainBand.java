package com.codecool.SzlukaEszter.bands;

import java.util.List;
import java.util.Random;

public class MainBand extends WarmUpBand{
    protected WarmUpPortfolio wup;



    public MainBand(String name, Style style, WarmUpPortfolio wup) {
        super(name, style);
        this.wup = wup;
    }

    public WarmUpBand chooseWarmUp(){
        List<WarmUpBand> warmUpBands = wup.getWarmUps();
        WarmUpBand output;
        for (WarmUpBand warmUpBand : warmUpBands) {
            if (warmUpBand.getStyle() == this.getStyle()){
                return warmUpBand;
            }
        }
        return null;
    }
}
