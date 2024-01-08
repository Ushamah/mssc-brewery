package com.ushwamala.msscbrewery.services.v2;

import com.ushwamala.msscbrewery.web.model.v2.BeerDtoV2;
import com.ushwamala.msscbrewery.web.model.v2.BeerStyleEnum;

import java.util.Random;
import java.util.UUID;

public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 findBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Budd")
                .beerStyle(BeerStyleEnum.ALE)
                .upc(generateUpc())
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        System.out.println("updated");
    }

    @Override
    public void deleteById(UUID beerId) {
        System.out.println("deleted");
    }

    private Long generateUpc() {
        var randomUPC = new Random().nextLong();
        if (randomUPC < 0) {
            return randomUPC * (-1);
        }
        return randomUPC;
    }
}