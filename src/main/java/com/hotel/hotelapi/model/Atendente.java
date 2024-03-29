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
@Table(name="Atendente")
public class Atendente implements Serializable{
    
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codAtend;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private String nome;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private Date dt_nasc;



    public long getCodAtend() {
		return codAtend;
	}
	public void setCodAtend(long codAtend) {
		this.codAtend = codAtend;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDate_nasc() {
		return dt_nasc;
	}
	public void setQuantidade(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

}
