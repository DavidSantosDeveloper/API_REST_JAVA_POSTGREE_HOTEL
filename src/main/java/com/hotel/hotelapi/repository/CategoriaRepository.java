package com.hotel.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
    
}
