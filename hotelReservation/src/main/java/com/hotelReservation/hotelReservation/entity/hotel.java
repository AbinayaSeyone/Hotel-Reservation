package com.hotelReservation.hotelReservation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.internal.util.Contracts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotel")
public class hotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "hotelId")
    private Long hotelId;
    private String hotelName;
    private String location;

//    @OneToMany(mappedBy = "hotelId")
//    private List<hotel> hotels;

    @JsonIgnore
    @OneToMany(mappedBy = "hotel")
    private Set<contract> contracts=new HashSet<>();


//    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
//    private List<contract>contracts=new ArrayList<>();

//    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
//    private List<room>rooms=new ArrayList<>();

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "hotelId",referencedColumnName = "hotelId")
//    private List<room>rooms;




}
