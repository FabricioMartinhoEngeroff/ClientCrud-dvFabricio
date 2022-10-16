package com.DvFabricio.Client.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DvFabricio.Client.dto.ClientDTO;
import com.DvFabricio.Client.entities.Client;
import com.DvFabricio.Client.repositories.ClientRepository;
import com.DvFabricio.Client.services.exceptions.EntityNotFoundException;

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

	@Transactional(readOnly = true)
	public ClientDTO finById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(()-> new EntityNotFoundException("Entity not found out"));
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setChildren(dto.getChildren());
		entity = repository.save(entity);
		return new ClientDTO(entity);
		
	}
}
