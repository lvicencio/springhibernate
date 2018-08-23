package com.sitio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contacto")
public class Contacto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idC")
	private Integer idC;
	
	@Column(name="medio")
	private String medio;
	
	@Column(name="dato")
	private String dato;

	//relacion muchos a 1
	@ManyToOne
	@JoinColumn(name="id")   
	private Empleado empleado;
	
	
	public Contacto() {}
	
	public Contacto(Integer idC, String medio, String dato) {
		this.idC = idC;
		this.medio = medio;
		this.dato = dato;
	}

	public Integer getIdC() {
		return idC;
	}

	public void setIdC(Integer idC) {
		this.idC = idC;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Contacto [idC=" + idC + ", medio=" + medio + ", dato=" + dato + "]";
	}
	
	
}
