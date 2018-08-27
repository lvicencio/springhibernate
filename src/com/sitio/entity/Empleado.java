package com.sitio.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="empleado")
public class Empleado {

	@Id
	@Column(name="id")
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name="system-increment", strategy="increment")
	private Integer id;
	
	@Column(name = "full_name")
	@NotNull
	private String full_name;
	
	@Column(name = "email")
	@NotEmpty
	private String email;
	
	@Column(name = "direccion")
	@NotEmpty
	private String direccion;
	
	@Column(name = "ciudad")
	@NotEmpty
	private String ciudad;
	
	@Column(name = "genero")
	@NotEmpty
	private String genero;
	
	@Column(name = "skill")
	@NotEmpty
	private String skill;
	
	@Column(name = "fecha_nacimiento")
	@NotEmpty
	private String fecha_nacimiento;
	
	//relacion uno a muchos
	@OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
	//@JoinColumn(name = "id") //
	private Set<Contacto> contactos;
	
	
	
	
	public Empleado() {
		
	}
	public Empleado(Integer id, String full_name, String email, String direccion, String ciudad, String genero,
			String skill, String fecha_nacimiento, Set<Contacto> contactos) {
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.genero = genero;
		this.skill = skill;
		this.fecha_nacimiento = fecha_nacimiento;
		this.contactos = contactos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Set<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	
	
	
	
}
