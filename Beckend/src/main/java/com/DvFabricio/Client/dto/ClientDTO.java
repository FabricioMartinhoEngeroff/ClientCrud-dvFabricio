package com.DvFabricio.Client.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;


import com.DvFabricio.Client.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;  

	BigDecimal total = new BigDecimal("500.000");
	Instant now = Instant.now();

	private long id;
	private String name;
	private Double cpf;
	private BigDecimal income;
	private Instant birthDate;
	private Double children;
	
	
	
	public ClientDTO() {
	}

	public ClientDTO(long id, String name, Double cpf, BigDecimal income, Double children, Instant birth_date) {
		super();
		this.id = id;
		this.name = name;
	    this.cpf = cpf;
		this.income = income;
		this.birthDate = birth_date;
		this.children = children;
		
	}

	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCpf() {
		return cpf;
	}

	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getIncome() {
		return income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Double getChildren() {
		return children;
	}

	public void setChildren(Double children) {
		this.children = children;
	}

	public Instant getBirth_date() {
		return birthDate;
	}

	public void setBirth_date(Instant birth_date) {
		this.birthDate = birth_date;
	}
	
	
}
