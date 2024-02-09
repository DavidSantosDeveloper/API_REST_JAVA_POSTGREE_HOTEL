package com.hotel.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelapi.model.Atendente;

public interface AtendenteRepository extends JpaRepository<Atendente,Long>{
    
}
