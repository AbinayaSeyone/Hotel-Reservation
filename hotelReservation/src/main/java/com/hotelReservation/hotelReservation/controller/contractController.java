package com.hotelReservation.hotelReservation.controller;

import com.hotelReservation.hotelReservation.entity.contract;
import com.hotelReservation.hotelReservation.entity.hotel;
import com.hotelReservation.hotelReservation.service.contractService;
import com.hotelReservation.hotelReservation.service.hotelService;
import jakarta.validation.Valid;
import org.hibernate.validator.internal.util.Contracts;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class contractController
{
    @Autowired
    private contractService contractService;
    @Autowired
    private hotelService hotelService;

//    create contract
    @PostMapping("/contracts")
    public contract saveContract( @Valid @RequestBody contract contracts){
        return contractService.saveContract(contracts);
    }
//    public ResponseEntity<contract> createContractWithHotelId(@RequestBody contract contractRequest) {
//        try {
//            // Check if the hotel with the given hotelId exists
//            hotel existingHotel = hotelService.findById(contractRequest.getH
//            if (existingHotel == null) {
//                return new ResponseEntity<>("Hotel not found with id: " + contractRequest.getHotelId(), HttpStatus.NOT_FOUND);
//            }
//
//            // Create a new contract and set the hotel
//            contract newContract = new contract();
//            newContract.setStartDate(contractRequest.getStartDate());
//            newContract.setEndDate(contractRequest.getEndDate());
//            newContract.setHotel(existingHotel);
//
//            // Save the new contract
//            contract savedContract = contractService.saveContract(newContract);
//
//            return new ResponseEntity<Contract>(savedContract, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
    //Fetch the contacts
    @GetMapping("/contracts")
    public List<contract> fetchContractList(){
        return contractService.fetchContractList();
    }
//    //update contract with hotelId
//    @PutMapping("/contracts/{contractId}/hotels/{hotelId}")
//    public contract updateContract(@PathVariable("contractId") Long contractId,@PathVariable("hotelId")Long hotelId){
//        return contractService.updateContract(contractId,hotelId);
//    }
//
//    //Delete a particular contract
//    @DeleteMapping("/contracts/{contractId}")
//    public String deleteContractById(@PathVariable("contractId")Long contractId){
//        contractService.deleteContractById(contractId);
//        return "contract deleted successfully!!";
//    }
}


