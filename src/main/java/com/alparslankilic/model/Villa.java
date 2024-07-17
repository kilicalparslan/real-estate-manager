package com.alparslankilic.model;

public class Villa extends Home {
    public Villa(double price, double squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        super(price, squareMeters, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() + "}";
    }
}
