package com.hotel.hotelapi.resources;

import com.hotel.hotelapi.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotelapi.repository.AtendenteRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/api/atendente")

public class AtendenteResource {
    @Autowired
    AtendenteRepository atendenteRespository;

    @GetMapping("")
    public List<Atendente> listarAtendente(){
        return atendenteRespository.findAll();
    }

    @GetMapping("/{id}")
    public Hospede listaAtendenteID(@PathVariable(value="id") long id){
        return atendenteRespository.findByCodAtend(id);
    }

    @PostMapping("")
    public Atendente salvarAtendente(@RequestBody Atendente atendente){
        return atendenteRespository.save(atendente);
    }

    @DeleteMapping("")
    public void deletarAtendente(@RequestBody Atendente atendente){
       atendenteRespository.delete(atendente);
    }

    @PutMapping("")
    public Atendente AtualizarAtendente(@RequestBody Atendente atendente){
       return atendenteRespository.save(atendente);
    }



    
}
