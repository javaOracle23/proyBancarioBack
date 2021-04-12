package com.banco.apirest.models.service;

import java.util.List;

import com.banco.apirest.models.entity.Cliente;

public interface ClienteService {

	
	public List<Cliente> getClientes();

	public Cliente saveCliente(Cliente cliente);
	
	
}
