package com.hotel.hotelapi.resources;

import com.hotel.hotelapi.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotelapi.repository.AptoRepository;
import com.hotel.hotelapi.repository.AtendenteRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/api/apto")

public class AptoResource {
    @Autowired
    AptoRepository aptoRespository;

    @GetMapping("")
    public List<Apto> listarApto(){
        return aptoRespository.findAll();
    }

    @GetMapping("/{id}")
    public Apto listaAptoID(@PathVariable(value="id") long id){
        return aptoRespository.findByNum(id);
    }

    @PostMapping("")
    public Apto salvarApto(@RequestBody Apto apto){
        return aptoRespository.save(apto);
    }

    @DeleteMapping("")
    public void deletarApto (@RequestBody Apto apto){
       aptoRespository.delete(apto);
    }

    @PutMapping("")
    public Apto AtualizarApto(@RequestBody Apto apto){
       return aptoRespository.save(apto);
    }



    
}
