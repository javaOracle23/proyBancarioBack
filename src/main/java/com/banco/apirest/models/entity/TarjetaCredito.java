package com.banco.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarjeta_credito")
public class TarjetaCredito {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="franquisia")
	private String franquisia;
	
	@Column(name="cupo")
	private String cupo;
	
	@Column(name="fecha_vencimiento")
	private String fechaVencimiento;

	
	@Column(name="id_cliente")
	private Integer idCliente;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFranquisia() {
		return franquisia;
	}

	public void setFranquisia(String franquisia) {
		this.franquisia = franquisia;
	}

	public String getCupo() {
		return cupo;
	}

	public void setCupo(String cupo) {
		this.cupo = cupo;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
	

}
