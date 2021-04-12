package com.banco.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.banco.apirest.models.entity.Cliente;
import com.banco.apirest.models.entity.User;

public interface ClienteDAO  extends CrudRepository<Cliente, Integer> {
	
	
}
