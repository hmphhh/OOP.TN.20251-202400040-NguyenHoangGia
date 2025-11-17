package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {

    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, cost, category);
        this.director = director;
        this.length = length;
    }

    public String toString() {
        return super.toString()
                + "[" + this.length + "]"
                + "[" + this.director + "]";
    }
}
