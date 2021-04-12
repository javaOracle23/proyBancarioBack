package com.banco.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.banco.apirest.models.entity.Cliente;
import com.banco.apirest.models.entity.TarjetaCredito;
import com.banco.apirest.models.service.ClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	ClienteService clienteService;
		
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente addCliente(@RequestBody Cliente cliente) {
		cliente.setId(null);
		clienteService.saveCliente(cliente);		
		return cliente;
	}
	
	@GetMapping("/clientes")
	public List<Cliente> getClientes() {
		return clienteService.getClientes();
	}
	
	@PutMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente updateCliente(@RequestBody Cliente cliente) {		
		clienteService.saveCliente(cliente);		
		return cliente;
	}
	
	@GetMapping("/clientes/{identificacion}")
	public Cliente getClienteByIdentificacion(@PathVariable String identificacion) {		
		List<Cliente> listCliente = clienteService.getClientes();
		Cliente objCliente = null;
		if(listCliente != null ) {			
			for(Cliente obj: listCliente ) {				
				if(obj.getIdentificacion().equalsIgnoreCase(identificacion)) {
					objCliente = obj;					
					break;
				}
			}
		}
		return objCliente;
	}	
	
}
