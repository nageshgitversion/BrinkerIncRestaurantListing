package com.BrinkerInc.BrinkerIncRestaurantListing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BrinkerInc.BrinkerIncRestaurantListing.dto.RestaurantDto;
import com.BrinkerInc.BrinkerIncRestaurantListing.entity.Restaurant;
import com.BrinkerInc.BrinkerIncRestaurantListing.map.RestaurantMapper;
import com.BrinkerInc.BrinkerIncRestaurantListing.repository.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepo repo;
	
	
	// code add new restaurant
	public RestaurantDto addRestaurantInDB(RestaurantDto dto) {
		
		Restaurant restaurant = repo.save(RestaurantMapper.INSTANCE.mapRestaurantDtoToRestaurant(dto));
		
		return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant);
	}
	
	
	//code to getAll restaurants at once
	
	public List<RestaurantDto> getAllRestaurants(){
		
		
		List<Restaurant> restaurants = repo.findAll();
		
		List<RestaurantDto> list = restaurants.stream().map(restaurant->RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant)).toList();
		return list;
	}
	
	
	//code to get restaurant by id
	public ResponseEntity<RestaurantDto> findRestaurantById(Integer id) {
		
		Optional<Restaurant> byId = repo.findById(id);
		
		if(byId.isPresent()) {
			Restaurant restaurant = byId.get();
			return new ResponseEntity<>(RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDto(restaurant),HttpStatus.OK);
		}else {
			return new ResponseEntity<> (null,HttpStatus.BAD_REQUEST);
		}
	}

}
