package com.alparslankilic.model;

public class Summerhouse extends Home {
    public Summerhouse(double price, double squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        super(price, squareMeters, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public String toString() {
        return "Summerhouse{" + super.toString() + "}";
    }
}
