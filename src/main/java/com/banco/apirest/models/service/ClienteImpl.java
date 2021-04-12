package com.banco.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.apirest.models.dao.ClienteDAO;
import com.banco.apirest.models.entity.Cliente;

@Service
public class ClienteImpl implements ClienteService{

	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDAO.findAll();
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDAO.save(cliente);
	}
	
	
}
