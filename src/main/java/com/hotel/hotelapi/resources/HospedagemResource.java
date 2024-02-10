package com.hotel.hotelapi.resources;

import com.hotel.hotelapi.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotelapi.repository.AptoRepository;
import com.hotel.hotelapi.repository.AtendenteRepository;
import com.hotel.hotelapi.repository.HospedagemRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/api/hospedagem")

public class HospedagemResource {
    @Autowired
    HospedagemRepository hospedagemRespository;

    @GetMapping("")
    public List<Hospedagem> listarHospedagem(){
        return hospedagemRespository.findAll();
    }

    @GetMapping("/{id}")
    public Hospedagem listaHospedagemID(@PathVariable(value="id") long id){
        return hospedagemRespository.findByCodHospeda(id);
    }

    @PostMapping("")
    public Hospedagem salvarHospedagem(@RequestBody Hospedagem hospedagem){
        return hospedagemRespository.save(hospedagem);
    }

    @DeleteMapping("")
    public void deletarHospedagem (@RequestBody Hospedagem hospedagem){
       hospedagemRespository.delete(hospedagem);
    }

    @PutMapping("")
    public Hospedagem AtualizarHospedagem(@RequestBody Hospedagem hospedagem){
       return hospedagemRespository.save(hospedagem);
    }



    
}
