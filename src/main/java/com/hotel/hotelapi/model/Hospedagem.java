package com.hotel.hotelapi.model;

import java.io.Serializable;
import java.sql.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Hospedagem")

public class Hospedagem implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codHospeda;

	// RELACAO COM HOSPEDE
	@ManyToOne
    @JoinColumn(name = "cod_hosp")
    private Hospede hospede;
    // RELACAO COM APTO
    @ManyToOne
    @JoinColumn(name = "num")
    private Apto apto;
    // RELACAO COM ATENDENTE
    @ManyToOne
    @JoinColumn(name = "cod_atend")
    private Atendente atendente;

    @SuppressWarnings("deprecation")
    @NotNull
	private Date dt_ent;

	private Date dt_sai;

    public long getCodHospeda(){
        return this.codHospeda;
    }
    public void setCodHospeda(long codHospeda){
        this.codHospeda=codHospeda;
    }
    public Hospede getHospede(){
        return this.hospede;
    }
    public void setHospede(Hospede hospede){
        this.hospede=hospede;

    }
    public Apto getApto(){
        return this.apto;
    }
    public void setApto(Apto apto){
        this.apto=apto;

    }
    public Atendente getAtendente(){
        return this.atendente;
    }
    public void setAtendente(Atendente atendente){
        this.atendente=atendente;

    }
    public Date getDt_ent(){
        return this.dt_ent;
    }
    public void setDt_ent(Date dt_ent){
        this.dt_ent=dt_ent;

    }
    public Date getDt_sai(){
        return this.dt_sai;
    }
    public void setDt_sai(Date dt_sai){
        this.dt_sai=dt_sai;

    }


    
    
}
