package com.hoteis.hoteis.service.contracts;

import java.util.List;

import com.hoteis.hoteis.models.Hotel;

public interface HotelServiceContract {
    List<Hotel> getAllHotels();
    Hotel getById(Long Id);
    Hotel insertHotel(Hotel hotel);
    Hotel editHotel(Long id, Hotel hotel);
    void deleteHotel(Long id);

}
