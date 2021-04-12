package com.banco.apirest.models.service;

import java.util.List;

import com.banco.apirest.models.entity.TarjetaCredito;


public interface TarjetaCreditoService {
	
	public List<TarjetaCredito> getTarjetaCreditos();

	public TarjetaCredito saveTarjetaCredito(TarjetaCredito tarjetaCredito);	
	
}


