package com.sitio.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitio.entity.Empleado;


@Repository
public class EmpleadoDAOImp implements EmpleadoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(empleado);
		
	}

}
