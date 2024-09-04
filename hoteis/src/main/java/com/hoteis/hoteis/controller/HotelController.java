package com.hoteis.hoteis.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.hoteis.hoteis.models.Hotel;
import com.hoteis.hoteis.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    
    private HotelService hotelService;

    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<Hotel> getAllHotels(){
        return hotelService.getAllHotels();
    }

    @GetMapping("{Id}")
    public Hotel getById(@PathVariable Long Id){
        return hotelService.getById(Id);
    }

    @PostMapping
    public Hotel insertHotel(@RequestBody Hotel hotel){
        return hotelService.insertHotel(hotel);
    }

    @PutMapping("{Id}")
    public Hotel editHotel(@PathVariable Long Id,@RequestBody Hotel hotel){
        return hotelService.editHotel(Id, hotel);
    }

    @DeleteMapping("{Id}")
    public void deleteHotel(@PathVariable Long Id){
        hotelService.deleteHotel(Id);
    }

}
