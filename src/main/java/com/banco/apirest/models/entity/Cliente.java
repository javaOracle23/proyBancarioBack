package com.banco.apirest.models.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="cliente")
	public class Cliente {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Integer id;
		
		@Column(name="nombres")
		private String nombres;
		
		@Column(name="apellidos")
		private String apellidos;
		
		@Column(name="identificacion")
		private String identificacion;
		
		@Column(name="email")
		private String email;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getIdentificacion() {
			return identificacion;
		}

		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}	
		
		
		
	
}
