package com.ushwamala.msscbrewery.services;

import com.ushwamala.msscbrewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {
    BeerDto findBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}

