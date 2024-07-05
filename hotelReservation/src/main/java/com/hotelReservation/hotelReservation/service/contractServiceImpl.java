package com.hotelReservation.hotelReservation.service;

import com.hotelReservation.hotelReservation.entity.contract;
import com.hotelReservation.hotelReservation.entity.hotel;
import com.hotelReservation.hotelReservation.repository.contractRepository;
import com.hotelReservation.hotelReservation.repository.hotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class contractServiceImpl implements contractService
{
    @Autowired
    private contractRepository contractRepository;
    @Autowired
    private hotelRepository hotelRepository;
    @Override
    public contract saveContract( contract contracts )
    {
        return contractRepository.save(contracts);
    }
    @Override
    public List<contract> fetchContractList() {
        return contractRepository.findAll();
    }

    @Override
    public contract updateContract( Long contractId, Long hotelId )
    {
        contract newContract =contractRepository.findById( contractId).get();
        hotel existingHotel =hotelRepository.findById( hotelId).get();
        newContract.setHotel(existingHotel);
        return contractRepository.save( newContract );
    }

    @Override
    public void deleteContractById( Long contractId )
    {
        contractRepository.deleteById(contractId);
    }

}
