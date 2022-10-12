package com.DvFabricio.Client.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DvFabricio.Client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource  {

	@GetMapping
	public ResponseEntity<List<Client>>findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(0, null, null, null, null, null));
		return ResponseEntity.ok().body(list);
}
}