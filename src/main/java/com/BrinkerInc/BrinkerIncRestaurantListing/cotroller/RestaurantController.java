package com.BrinkerInc.BrinkerIncRestaurantListing.cotroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BrinkerInc.BrinkerIncRestaurantListing.dto.RestaurantDto;
import com.BrinkerInc.BrinkerIncRestaurantListing.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService service;
	
	@PostMapping("/addrestaurant")
	public ResponseEntity<RestaurantDto> addRestaurantInDB(@RequestBody RestaurantDto dto){
		
		RestaurantDto restaurantdto = service.addRestaurantInDB(dto);
		
		return new ResponseEntity<>(restaurantdto,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getallrestaurants")
	public ResponseEntity<List<RestaurantDto>> getAll(){
		
		List<RestaurantDto> allRestaurants = service.getAllRestaurants();
		
		return new ResponseEntity<>(allRestaurants,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<RestaurantDto> getById(@PathVariable Integer id){
		
		return service.findRestaurantById(id);
		
	}

}
