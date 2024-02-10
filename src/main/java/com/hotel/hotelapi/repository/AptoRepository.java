package com.hotel.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelapi.model.Apto;


public interface AptoRepository extends JpaRepository<Apto,Long> {
    Apto findByNum(long num);
}
