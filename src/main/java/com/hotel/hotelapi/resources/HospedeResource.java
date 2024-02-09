package com.hotel.hotelapi.resources;

import com.hotel.hotelapi.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotelapi.repository.HospedeRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/api")

public class HospedeResource {
    @Autowired
    HospedeRepository hospedeRespository;

    @GetMapping("/hospede")
    public List<Hospede> listarHospede(){
        return hospedeRespository.findAll();
    }

    @GetMapping("/hospede/{id}")
    public Hospede listaHospedeID(@PathVariable(value="id") long id){
        return hospedeRespository.findByCodHosp(id);
    }

    @PostMapping("/hospede")
    public Hospede salvarHospede(@RequestBody Hospede hospede){
        return hospedeRespository.save(hospede);
    }

    @DeleteMapping("/hospede")
    public void deletarHospede(@RequestBody Hospede hospede){
       hospedeRespository.delete(hospede);
    }

    @PutMapping("/hospede")
    public Hospede AtualizarHospede(@RequestBody Hospede hospede){
       return hospedeRespository.save(hospede);
    }



    
}
