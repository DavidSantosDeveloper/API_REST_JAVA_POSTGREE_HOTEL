package com.hotel.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelapi.model.Hospede;

public interface HospedeRepository  extends JpaRepository<Hospede,Long>{

    Hospede findByCodHosp(long codHosp);
}
