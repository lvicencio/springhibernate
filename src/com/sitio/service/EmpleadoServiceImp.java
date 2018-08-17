package com.sitio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sitio.dao.EmpleadoDAO;
import com.sitio.entity.Empleado;

@Service
public class EmpleadoServiceImp implements EmpleadoService {

	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@Override @Transactional
	public void saveEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoDAO.saveEmpleado(empleado);
	}

	@Override @Transactional
	public List<Empleado> listadoEmpleado() {
		// TODO Auto-generated method stub
		return empleadoDAO.listadoEmpleado();
	}

}
