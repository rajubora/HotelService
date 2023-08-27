package com.lcwr.hotel.service;

import com.lcwr.hotel.entity.Hotel;

import java.util.List;


public interface HotelService {


    Hotel createHotel(Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotel(String id );

}
