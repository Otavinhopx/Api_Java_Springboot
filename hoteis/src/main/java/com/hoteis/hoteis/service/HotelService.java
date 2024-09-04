package com.hoteis.hoteis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoteis.hoteis.models.Hotel;
import com.hoteis.hoteis.repository.HotelRepository;
import com.hoteis.hoteis.service.contracts.HotelServiceContract;

@Service
public class HotelService implements HotelServiceContract{

    
    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getById(Long Id) {
        return hotelRepository.findById(Id).orElseThrow(() -> new RuntimeException("Não foi possível encontrar um hotel"));
    }

    @Override
    public Hotel insertHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel editHotel(Long Id, Hotel hotel) {
        Hotel findedHotel = hotelRepository.findById(Id).orElseThrow(() -> new RuntimeException("Não foi possível encontrar um hotel"));
        findedHotel.setId(Id);
        findedHotel.setName(hotel.getName());
        findedHotel.setCity(hotel.getCity());
        findedHotel.setState(hotel.getState());
        findedHotel.setDiary(hotel.getDiary());
        findedHotel.setStars(hotel.getStars());
        return hotelRepository.save(findedHotel);
    }

    @Override
    public void deleteHotel(Long Id) {
        hotelRepository.deleteById(Id);
    }
    
}
