package com.hotel.hotelapi.resources;

import com.hotel.hotelapi.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotelapi.repository.AtendenteRepository;
import com.hotel.hotelapi.repository.CategoriaRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/api/categoria")

public class CategoriaResource {
    @Autowired
    CategoriaRepository categoriaRespository;

    @GetMapping("")
    public List<Categoria> listarCategoria(){
        return categoriaRespository.findAll();
    }

    @GetMapping("/{id}")
    public Categoria listaCategoriaID(@PathVariable(value="id") long id){
        return categoriaRespository.findByCodCat(id);
    }

    @PostMapping("")
    public Categoria salvarCategoria(@RequestBody Categoria categoria){
        return categoriaRespository.save(categoria);
    }

    @DeleteMapping("")
    public void deletarCategoria(@RequestBody Categoria categoria){
       categoriaRespository.delete(categoria);
    }

    @PutMapping("")
    public Categoria AtualizarCategoria(@RequestBody Categoria categoria){
       return categoriaRespository.save(categoria);
    }



    
}
