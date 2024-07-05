package com.hotelReservation.hotelReservation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contract")
public class contract
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contractId;
    private Date startDate;
    private Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelId",referencedColumnName = "hotelId")
    private hotel hotel;

    public void setHotel( com.hotelReservation.hotelReservation.entity.hotel hotel )
    {
        this.hotel = hotel;
    }

    public void assignHotel( hotel hotel )
    {
        this.hotel=hotel;
    }



    //    @ManyToOne
//    private hotel hotelId;

//    @ManyToOne
//    @JoinColumn(name = "hotelId", referencedColumnName = "hotelId")
//    private hotel hotel;


}


