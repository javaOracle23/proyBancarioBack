package com.banco.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.apirest.models.dao.TarjetaCreditoDAO;
import com.banco.apirest.models.entity.TarjetaCredito;

@Service
public class TarjetaCreditoImpl implements TarjetaCreditoService{

	@Autowired
	private TarjetaCreditoDAO tarjetaCreditoDAO;
	
	@Override
	public List<TarjetaCredito> getTarjetaCreditos() {
		// TODO Auto-generated method stub
		return (List<TarjetaCredito>) tarjetaCreditoDAO.findAll();
	}

	@Override
	public TarjetaCredito saveTarjetaCredito(TarjetaCredito tarjetaCredito) {
		// TODO Auto-generated method stub
		return tarjetaCreditoDAO.save(tarjetaCredito);
		
		
	}

}
