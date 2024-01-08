package com.ushwamala.msscbrewery.services.v2;

import com.ushwamala.msscbrewery.web.model.BeerDto;
import com.ushwamala.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;


public interface BeerServiceV2 {
    BeerDtoV2 findBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}

