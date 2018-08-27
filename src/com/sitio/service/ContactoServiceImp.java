package com.sitio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sitio.dao.ContactoDAO;
import com.sitio.dao.EmpleadoDAO;
import com.sitio.entity.Contacto;
import com.sitio.entity.Empleado;

@Service
public class ContactoServiceImp implements ContactoService {

	@Autowired
	private ContactoDAO contactoDAO;
	@Autowired
	private EmpleadoDAO empleadoDAO;

	@Override @Transactional
	public void save(Empleado empleado, Contacto contacto) {
		// TODO Auto-generated method stub
		contacto.setEmpleado(empleado);
		contactoDAO.save(contacto);
	
		
	}


	@Override @Transactional
	public List<Contacto> findAll(Integer empleadoId) {
		// TODO Auto-generated method stub
		Empleado empleado = empleadoDAO.getEmpleadoById(empleadoId);
		return contactoDAO.findAll(empleado);
	}
	
	
}
