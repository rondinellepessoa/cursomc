package com.rondinellesilva.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rondinellesilva.cursomc.domain.Cliente;
import com.rondinellesilva.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
