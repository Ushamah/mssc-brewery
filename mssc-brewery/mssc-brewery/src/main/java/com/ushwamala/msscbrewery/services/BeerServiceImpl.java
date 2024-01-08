package com.ushwamala.msscbrewery.services;

import com.ushwamala.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto findBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Budd")
                .beerStyle("light")
                .upc(generateUpc())
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        System.out.println("updated");
    }

    @Override
    public void deleteById(UUID beerId) {
        System.out.println("deleted");
    }

    private Long generateUpc(){
        var randomUPC = new Random().nextLong();
        if (randomUPC < 0){
           return randomUPC * (-1);
        }
        return randomUPC;
    }
}
