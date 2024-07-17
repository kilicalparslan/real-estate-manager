package com.alparslankilic.repository;

import com.alparslankilic.model.Home;
import com.alparslankilic.model.Summerhouse;
import com.alparslankilic.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    public List<Home> getHomeList() {
        List<Home> homes = new ArrayList<>();
        homes.add(new Home(100000, 120, 3, 1));
        homes.add(new Home(150000, 140, 4, 1));
        homes.add(new Home(200000, 160, 5, 2));
        return homes;
    }

    public List<Villa> getVillaList() {
        List<Villa> villas = new ArrayList<>();
        villas.add(new Villa(300000, 200, 6, 2));
        villas.add(new Villa(350000, 220, 7, 2));
        villas.add(new Villa(400000, 250, 8, 3));
        return villas;
    }

    public List<Summerhouse> getSummerhouseList() {
        List<Summerhouse> summerhouses = new ArrayList<>();
        summerhouses.add(new Summerhouse(250000, 180, 5, 2));
        summerhouses.add(new Summerhouse(280000, 190, 6, 2));
        summerhouses.add(new Summerhouse(320000, 210, 7, 3));
        return summerhouses;
    }
}