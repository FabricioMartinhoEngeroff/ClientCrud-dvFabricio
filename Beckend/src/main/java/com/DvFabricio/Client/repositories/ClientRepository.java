package com.DvFabricio.Client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DvFabricio.Client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
