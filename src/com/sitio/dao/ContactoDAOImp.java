package com.sitio.dao;



import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	public List<Contacto> findAll(Empleado empleado) {
		
		
		
		
		Integer empId = empleado.getId();
		String id_e = Integer.toString(empId);
		//System.out.println(empId);
	
		String hql = "from Contacto c WHERE empleado =" + id_e;
		Session currentSession = sessionFactory.getCurrentSession();
		List<Contacto> laQuery = currentSession.createQuery(hql)
				//.setParameter("empleado.id", empId)
				.list();
		return laQuery;
		
	}

}
