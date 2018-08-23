package com.sitio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sitio.dao.ContactoDAO;
import com.sitio.entity.Contacto;
import com.sitio.entity.Empleado;

@Service
public class ContactoServiceImp implements ContactoService {

	@Autowired
	private ContactoDAO contactoDAO;

	@Override @Transactional
	public void save(Empleado empleado, Contacto contacto) {
		// TODO Auto-generated method stub
		contacto.setEmpleado(empleado);
		contactoDAO.save(contacto);
	
		
	}

	@Override @Transactional
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
