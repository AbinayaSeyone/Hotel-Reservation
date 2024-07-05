package com.hotelReservation.hotelReservation.repository;

import com.hotelReservation.hotelReservation.entity.contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contractRepository extends JpaRepository<contract,Long>{

}
