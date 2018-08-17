package com.sitio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sitio.entity.Empleado;
import com.sitio.service.EmpleadoService;


@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@RequestMapping(value = "/vistaempleado")
	public String agregarEmpleado(Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		
		return "vistaempleado";
	}
	
	@RequestMapping(value="/guardarEmpleado")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		
		empleadoService.saveEmpleado(empleado);
		
		return "ListadoEstudiante";
	}
	
}
