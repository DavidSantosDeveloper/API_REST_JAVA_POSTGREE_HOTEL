package com.hotel.hotelapi.model;

import java.io.Serializable;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Apto")
public class Apto implements Serializable {

    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long num;
	
	@SuppressWarnings("deprecation")
    @NotNull
	private char status;
    
    // RELACIONAMENTO ENTRE APTO E CATEGORIA
     @ManyToOne
     @JoinColumn(name = "cod_cat")
     private Categoria categoria;

    public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public char getSatus() {
		return status;
	}
	public void setNome(char status) {
		this.status = status;
	}
	public Categoria getCategoria() {
		return this.categoria;
	}
	public void getCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
    
}
