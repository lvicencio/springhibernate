package com.sitio.service;

import java.util.List;

import com.sitio.entity.Contacto;
import com.sitio.entity.Empleado;

public interface ContactoService {

	public void save(Empleado empleado, Contacto contacto);
	public List<Contacto> findAll(Integer empleadoId);
		
}
