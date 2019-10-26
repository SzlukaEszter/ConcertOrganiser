package com.codecool.SzlukaEszter.bands;

public abstract class Band {
    protected String name;
    protected Style style;


    public String getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }

    public Band(String name, Style style) {
        this.name = name;
        this.style = style;
    }

    @Override
    public String toString() {
        return name + " style: " + style.name();
    }
}
