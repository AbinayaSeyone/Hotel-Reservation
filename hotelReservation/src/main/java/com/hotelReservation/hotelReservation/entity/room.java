package com.hotelReservation.hotelReservation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "room")
public class room
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomId;
    private String roomType;
    private Long price;
    private Integer noOfAdults;
    @Column(columnDefinition = "BOOLEAN")
    private Boolean status;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelId")
    private hotel hotel;



//    @ManyToOne
//    @JoinColumn(name = "hotelId")
//    private hotel hotel;

    @ManyToMany
    @JoinTable(name = "room_reservation",joinColumns = @JoinColumn(name = "roomId"),inverseJoinColumns = @JoinColumn(name = "reservationId"))
    private Set<reservation>reservations=new HashSet<>();


}
