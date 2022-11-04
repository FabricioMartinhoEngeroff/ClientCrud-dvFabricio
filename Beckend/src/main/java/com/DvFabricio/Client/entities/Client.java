package com.DvFabricio.Client.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "tb_clients")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	//BigDecimal total = new BigDecimal("500.000"); 
	//Instant now = Instant.now();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birthDate;
	private Integer children;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt; 
	
	public Client() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Double getIncome() {
		return income;
	}
	
	public void setIncome(Double income) {
		this.income = income;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getCreatedAt() { 
		return createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}
	
	@PrePersist
	public void prePersist() {
		createdAt = Instant.now();
	}
	
	@PreUpdate
	public void preUpdate() {
		updatedAt = Instant.now();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

	
