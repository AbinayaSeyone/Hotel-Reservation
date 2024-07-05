package com.hotelReservation.hotelReservation.service;

import com.hotelReservation.hotelReservation.entity.contract;
import com.hotelReservation.hotelReservation.entity.hotel;

import java.util.List;

public interface contractService
{
    public contract saveContract( contract contracts );
    public List<contract> fetchContractList();
    public contract updateContract( Long contractId, Long hotelId );

    public void deleteContractById( Long contractId );
}
