package com.DvFabricio.Client.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DvFabricio.Client.dto.ClientDTO;
import com.DvFabricio.Client.entities.Client;
import com.DvFabricio.Client.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		
		List<ClientDTO> listDto = new ArrayList<>();
		for (Client cat : list) {
			listDto.add(new ClientDTO(cat));
		}
		return listDto;
	}
}
