package com.hotel.hotelapi.model;

import java.io.Serializable;
import java.sql.Date;
import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Hospede")
public class Hospede implements Serializable{
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codHosp;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private String nome;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private Date dtNasc;



    public long getCod_hosp() {
		return codHosp;
	}
	public void setCod_hosp(long cod_hosp) {
		this.codHosp = cod_hosp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	
}
