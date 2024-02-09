package com.hotel.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelapi.model.Hospedagem;

public interface HospedagemRepository extends JpaRepository<Hospedagem,Long>{
    
}
