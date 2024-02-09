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
@Table(name="Categoria")

public class Categoria implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cod_cat;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private String  nome;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private float valor_dia;



    public long getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(long cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor_dia() {
		return this.valor_dia;
	}
	public void setValor_dia(float valor_dia) {
		this.valor_dia = valor_dia;
	}
    
}
