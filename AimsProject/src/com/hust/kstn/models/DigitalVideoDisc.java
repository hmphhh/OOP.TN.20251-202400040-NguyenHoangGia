package com.hust.kstn.models;

public class DigitalVideoDisc {

    private static int nbDigitalVideoDiscs = 0;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private int id;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    private static int nextId() {
        return ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        this.id = nextId();
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this.id = nextId();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.id = nextId();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.id = nextId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}
