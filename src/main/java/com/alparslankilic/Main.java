package com.alparslankilic;

import com.alparslankilic.repository.HouseRepository;
import com.alparslankilic.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseRepository repository = new HouseRepository();
        HouseService service = new HouseService(repository);

        System.out.println("Evlerin toplam fiyatı: " + service.getTotalPriceOfHomes());
        System.out.println("Villaların toplam fiyatı: " + service.getTotalPriceOfVillas());
        System.out.println("Yazlıkların toplam fiyatı: " + service.getTotalPriceOfSummerhouses());
        System.out.println("Tüm ev tiplerinin toplam fiyatı: " + service.getTotalPriceOfAllHomes());

        System.out.println("Evlerin ortalama metrekaresi: " + service.getAverageSquareMetersOfHomes());
        System.out.println("Villaların ortalama metrekaresi: " + service.getAverageSquareMetersOfVillas());
        System.out.println("Yazlıkların ortalama metrekaresi: " + service.getAverageSquareMetersOfSummerhouses());
        System.out.println("Tüm ev tiplerinin ortalama metrekaresi: " + service.getAverageSquareMetersOfAllHomes());

        System.out.println("En az 4 oda ve en az 1 salona sahip evler:");
        service.filterHomesByRoomsAndLivingRooms(4, 1).forEach(System.out::println);
    }
}