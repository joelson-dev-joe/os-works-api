package com.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osworks.api.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar () {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João Francisco");
		cliente1.setEmail("joao.francisco@gmail.com");
		cliente1.setTelefone("61 98888 7777");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria José");
		cliente2.setEmail("maria.jose@gmail.com");
		cliente2.setTelefone("61 97777 8888");
		
		return Arrays.asList(cliente1, cliente2);
		
	}
}
