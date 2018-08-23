package com.sitio.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitio.entity.Contacto;
import com.sitio.entity.Empleado;

@Repository
public class ContactoDAOImp implements ContactoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Contacto contacto) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(contacto);
	}

	@Override
	public List<Contacto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
