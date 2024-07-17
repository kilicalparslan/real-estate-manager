package com.alparslankilic.service;

import com.alparslankilic.model.Home;
import com.alparslankilic.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private final HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public double getTotalPriceOfHomes() {
        return repository.getHomeList().stream().mapToDouble(Home::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return repository.getVillaList().stream().mapToDouble(Home::getPrice).sum();
    }

    public double getTotalPriceOfSummerhouses() {
        return repository.getSummerhouseList().stream().mapToDouble(Home::getPrice).sum();
    }

    public double getTotalPriceOfAllHomes() {
        return getTotalPriceOfHomes() + getTotalPriceOfVillas() + getTotalPriceOfSummerhouses();
    }

    public double getAverageSquareMetersOfHomes() {
        return repository.getHomeList().stream().mapToDouble(Home::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfVillas() {
        return repository.getVillaList().stream().mapToDouble(Home::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfSummerhouses() {
        return repository.getSummerhouseList().stream().mapToDouble(Home::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllHomes() {
        return (repository.getHomeList().stream().mapToDouble(Home::getSquareMeters).sum() +
                repository.getVillaList().stream().mapToDouble(Home::getSquareMeters).sum() +
                repository.getSummerhouseList().stream().mapToDouble(Home::getSquareMeters).sum()) /
                (repository.getHomeList().size() + repository.getVillaList().size() + repository.getSummerhouseList().size());
    }

    public List<Home> filterHomesByRoomsAndLivingRooms(int minRooms, int minLivingRooms) {
        List<Home> allHomes = new ArrayList<>();
        allHomes.addAll(repository.getHomeList());
        allHomes.addAll(repository.getVillaList());
        allHomes.addAll(repository.getSummerhouseList());
        return allHomes.stream()
                .filter(home -> home.getNumberOfRooms() >= minRooms && home.getNumberOfLivingRooms() >= minLivingRooms)
                .toList();
    }
}