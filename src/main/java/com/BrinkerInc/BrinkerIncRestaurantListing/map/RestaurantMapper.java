package com.BrinkerInc.BrinkerIncRestaurantListing.map;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BrinkerInc.BrinkerIncRestaurantListing.dto.RestaurantDto;
import com.BrinkerInc.BrinkerIncRestaurantListing.entity.Restaurant;

@Mapper
public interface RestaurantMapper {
	
	
	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
	
	
	Restaurant mapRestaurantDtoToRestaurant(RestaurantDto restaurantDto);

    

    RestaurantDto mapRestaurantToRestaurantDto(Restaurant restaurant);

}
