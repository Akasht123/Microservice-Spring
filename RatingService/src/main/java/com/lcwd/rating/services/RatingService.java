package com.lcwd.rating.services;



import java.util.List;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repository.RatingRepository;


public interface RatingService {

	Rating create(Rating rating) ;
	
	List<Rating> getRating();
	
	List<Rating> getRatingByUserId(String userId);
	
	List<Rating> getRatingByHotelId(String hotelId);
}
