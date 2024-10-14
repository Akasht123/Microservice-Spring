package com.lcwd.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {
	
	public List<Rating> findByUserId(String userId);
	
	public List<Rating> findByHotelId(String hotelId);


}
