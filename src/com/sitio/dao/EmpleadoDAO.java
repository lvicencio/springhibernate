package com.sitio.dao;

import java.util.List;

import com.sitio.entity.Empleado;

public interface EmpleadoDAO {

	public void saveEmpleado(Empleado empleado);

	public List<Empleado> listadoEmpleado();

	public Empleado getEmpleadoById(Integer empleadoId);

	public void eliminarEmpleado(Empleado empleadoEliminar);
	

}
