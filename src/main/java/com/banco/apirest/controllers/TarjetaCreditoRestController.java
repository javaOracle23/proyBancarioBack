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
import com.banco.apirest.models.service.TarjetaCreditoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TarjetaCreditoRestController {
	
	@Autowired
	private TarjetaCreditoService tarjetaCreditoService;
	
	@PostMapping("/tarjetas")
	@ResponseStatus(HttpStatus.CREATED)
	public TarjetaCredito addTarjetaCredito(@RequestBody TarjetaCredito tarjetaCredito) {
		tarjetaCredito.setId(null);
		tarjetaCreditoService.saveTarjetaCredito(tarjetaCredito);		
		return tarjetaCredito;
	}
	
	@GetMapping("/tarjetas/{idcliente}")
	public TarjetaCredito getTarjetaCredito(@PathVariable String idcliente) {

		List<TarjetaCredito> lisTarjetas = tarjetaCreditoService.getTarjetaCreditos();
		TarjetaCredito objTarjetaCredito = null;
		if(lisTarjetas != null ) {
			int idCliente = Integer.parseInt(idcliente);
			for(TarjetaCredito obj: lisTarjetas ) {				
				if(obj.getIdCliente() ==  idCliente) {
					objTarjetaCredito = obj;
					break;
				}
			}
		}
		return objTarjetaCredito;
	}		
	
	
	@PutMapping("/tarjetas")
	@ResponseStatus(HttpStatus.CREATED)
	public TarjetaCredito updateTarjetaCredito(@RequestBody TarjetaCredito tarjetaCredito) {		
		tarjetaCreditoService.saveTarjetaCredito(tarjetaCredito);		
		return tarjetaCredito;
	}
	

}
