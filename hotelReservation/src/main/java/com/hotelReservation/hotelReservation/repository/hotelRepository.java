package com.hotelReservation.hotelReservation.repository;


import com.hotelReservation.hotelReservation.entity.hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hotelRepository extends JpaRepository<hotel,Long>
{
}
