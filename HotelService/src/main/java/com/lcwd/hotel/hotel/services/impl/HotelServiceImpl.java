package com.lcwd.hotel.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotolRepository;
import com.lcwd.hotel.services.HotelService;
@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotolRepository hotolRepository;
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotolRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotolRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotolRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Hotol not ound"));
	}

}
