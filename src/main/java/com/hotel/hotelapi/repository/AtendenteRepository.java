package com.hotel.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelapi.model.Atendente;
import com.hotel.hotelapi.model.Hospede;

public interface AtendenteRepository extends JpaRepository<Atendente,Long>{
    Hospede findByCodAtend(long codAtend);
}
