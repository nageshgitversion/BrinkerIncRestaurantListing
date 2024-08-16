package com.BrinkerInc.BrinkerIncRestaurantListing.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BrinkerInc.BrinkerIncRestaurantListing.entity.Restaurant;


@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Serializable>{

}
