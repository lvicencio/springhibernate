package com.sitio.dao;

import java.util.List;

import com.sitio.entity.Contacto;
import com.sitio.entity.Empleado;

public interface ContactoDAO {

	public void save(Contacto contacto);
	public List<Contacto> findAll();
}
