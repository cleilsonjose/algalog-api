package com.algaworks.algalog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Friedrich Nietzsche");
		cliente1.setEmail("Frederico_Nietzsche@gmail.com");
		cliente1.setTelefone("89 995412789");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Japion");
		cliente2.setEmail("Jaspion@gmail.com");
		cliente2.setTelefone("11 993322789");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
