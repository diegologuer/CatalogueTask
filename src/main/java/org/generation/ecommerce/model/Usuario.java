package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//TODO: Enditdad
	//TODO: Controller CRUD
	//TODO: Servicio
	//TODO: Repositorio
	//TODO: cambiar valedate -> update

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	Long id;
	@Column(nullable=false)
	String email;
	@Column(nullable=false)
	String password;
	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		
	}
	
	public Usuario() {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
