package com.hotelReservation.hotelReservation.controller;

import com.hotelReservation.hotelReservation.entity.hotel;
import com.hotelReservation.hotelReservation.service.hotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hotelController
{
    @Autowired
    private hotelService hotelService;

    //Create new hotels
    @PostMapping("/hotels")
    public hotel saveHotel( @Valid @RequestBody hotel hotels ){
        return hotelService.saveHotel(hotels);
    }

    //Fetch the hotels
    @GetMapping("/hotels")
    public List<hotel> fetchHotelList(){
        return hotelService.fetchHotelList();
    }

}
